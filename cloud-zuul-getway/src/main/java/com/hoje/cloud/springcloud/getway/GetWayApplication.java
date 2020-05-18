package com.hoje.cloud.springcloud.getway;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringCloudApplication
@EnableEurekaClient
public class GetWayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GetWayApplication.class, args);
    }
}
