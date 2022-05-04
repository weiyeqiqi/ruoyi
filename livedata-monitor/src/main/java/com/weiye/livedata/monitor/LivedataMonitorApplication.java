package com.weiye.livedata.monitor;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@MapperScan("com.weiye.livedata.monitor.dao")
@EnableFeignClients(basePackages = "com.weiye.livedata.monitor.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class LivedataMonitorApplication {

    public static void main(String[] args) {
        SpringApplication.run(LivedataMonitorApplication.class, args);
    }

}
