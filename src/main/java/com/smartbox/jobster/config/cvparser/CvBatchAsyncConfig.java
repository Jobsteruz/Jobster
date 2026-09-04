package com.smartbox.jobster.config.cvparser;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * Dedicated thread-pool executors for the CV-parser <em>batch</em> pipeline.
 * <p>
 * Kept separate from {@link CvParserAsyncConfig#CV_PARSER_EXECUTOR} so that batch runs cannot
 * starve the single-applicant V2 flow (and vice-versa). The sizing is intentional:
 * <ul>
 *   <li><b>Orchestrator pool</b> runs one task per batch (ZIP extraction + child dispatch). A
 *       single extraction is IO-bound and quick, so 1 core / 2 max is plenty.</li>
 *   <li><b>Upload pool</b> caps concurrent HTTP POSTs to {@code <parser-host>} at 4. The
 *       parser queues internally via RabbitMQ; sending more in parallel just wastes bandwidth
 *       and competes with other tenants for parser workers. {@link ThreadPoolExecutor.CallerRunsPolicy}
 *       provides natural backpressure if the queue overflows.</li>
 * </ul>
 */
@Configuration
@EnableConfigurationProperties(CvBatchProperties.class)
public class CvBatchAsyncConfig {

    public static final String CV_BATCH_ORCHESTRATOR_EXECUTOR = "cvBatchOrchestratorExecutor";
    public static final String CV_BATCH_UPLOAD_EXECUTOR = "cvBatchUploadExecutor";

    @Bean(CV_BATCH_ORCHESTRATOR_EXECUTOR)
    public AsyncTaskExecutor cvBatchOrchestratorExecutor(CvBatchProperties properties) {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(properties.orchestratorCoreThreadsOrDefault());
        executor.setMaxPoolSize(properties.orchestratorMaxThreadsOrDefault());
        executor.setQueueCapacity(properties.orchestratorQueueCapacityOrDefault());
        executor.setThreadNamePrefix("cv-batch-orch-");
        executor.setWaitForTasksToCompleteOnShutdown(true);
        executor.setAwaitTerminationSeconds(60);
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        executor.initialize();
        return executor;
    }

    @Bean(CV_BATCH_UPLOAD_EXECUTOR)
    public AsyncTaskExecutor cvBatchUploadExecutor(CvBatchProperties properties) {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(properties.uploadCoreThreadsOrDefault());
        executor.setMaxPoolSize(properties.uploadMaxThreadsOrDefault());
        executor.setQueueCapacity(properties.uploadQueueCapacityOrDefault());
        executor.setThreadNamePrefix("cv-batch-upload-");
        executor.setWaitForTasksToCompleteOnShutdown(true);
        executor.setAwaitTerminationSeconds(60);
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        executor.initialize();
        return executor;
    }
}
