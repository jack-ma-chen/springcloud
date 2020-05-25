package com.hoje.cloud.springcloud.service1;

import com.hoje.cloud.springcloud.service1.config.DynSourceConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Import;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@Import({DynSourceConfig.class})
@MapperScan(basePackages = "com.hoje.cloud.springcloud.service1.mapper")
@EnableEurekaClient
@EnableFeignClients
public class Server1Application {
    public static void main(String[] args) {
        SpringApplication.run(Server1Application.class, args);
    }

}
