package com.peanut.clickhouse.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import com.clickhouse.jdbc.ClickHouseDataSource;
import javax.sql.DataSource;
import java.util.Properties;

@Configuration
public class ClickHouseConfig {

    @Bean
    public DataSource clickHouseDataSource() throws Exception {
        Properties properties = new Properties();
        properties.setProperty("socket_timeout", "30000");
        properties.setProperty("connect_timeout", "30000");
        
        return new ClickHouseDataSource("jdbc:clickhouse://localhost:8123/default", properties);
    }

    @Bean
    public JdbcTemplate clickHouseJdbcTemplate(DataSource clickHouseDataSource) {
        return new JdbcTemplate(clickHouseDataSource);
    }
} 