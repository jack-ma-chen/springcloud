package com.hoje.cloud.springcloud.service1.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Component
@Configuration
public class DynSourceConfig {

    @Bean
    @ConfigurationProperties("spring.datasource.druid.master")
    public DataSource masterDataSource(){
        return DruidDataSourceBuilder.create().build();
    }
    @Bean
    @ConfigurationProperties("spring.datasource.druid.slave")
    public DataSource slaveDataSource(){
        return DruidDataSourceBuilder.create().build();
    }

    /*@Bean
    @Primary
    public DynamicDataSource(DataSource masterDataSource,DataSource slaveDataSource){
        Map<Object,Object> map = new HashMap<>();
        map.put("master",masterDataSource);
        map.put("slave",slaveDataSource);
        return new DynamicDataSource(masterDataSource,map);
    }*/
}
