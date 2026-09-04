package com.smartbox.jobster.config.cvparser;

import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.map.IMap;
import com.smartbox.jobster.config.caching.RedisCacheNames;
import com.smartbox.jobster.service.cvparser.batch.dto.CvParseBatch;
import com.smartbox.jobster.service.cvparser.dto.CvParseJob;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CvParserHazelcastConfig {

    @Bean("cvParseJobsMap")
    public IMap<String, CvParseJob> cvParseJobsMap(HazelcastInstance hazelcastInstance) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean("cvParseBatchesMap")
    public IMap<String, CvParseBatch> cvParseBatchesMap(HazelcastInstance hazelcastInstance) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
