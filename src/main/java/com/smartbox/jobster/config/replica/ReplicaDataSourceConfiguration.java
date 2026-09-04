package com.smartbox.jobster.config.replica;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.LazyConnectionDataSourceProxy;

import javax.sql.DataSource;
import java.util.Map;

@Configuration
public class ReplicaDataSourceConfiguration {

    @Bean
    @ConfigurationProperties("main.datasource")
    public DataSourceProperties primaryDataSourceProperties() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean
    @ConfigurationProperties("main.datasource.hikari")
    @DependsOn("jb_ApplicationContextRetriever")
    public HikariDataSource primaryDataSource(DataSourceProperties primaryDataSourceProperties) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean
    @ConfigurationProperties("replica.datasource")
    public DataSourceProperties replicaDataSourceProperties() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean
    @ConfigurationProperties("replica.datasource.hikari")
    public HikariDataSource replicaDataSource(
            @Qualifier("replicaDataSourceProperties") DataSourceProperties replicaDataSourceProperties) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    @Bean
    @Primary
    public DataSource dataSource(
            @Qualifier("primaryDataSource") DataSource primaryDataSource,
            @Qualifier("replicaDataSource") DataSource replicaDataSource,
            ReplicaHealthMonitor healthMonitor) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
