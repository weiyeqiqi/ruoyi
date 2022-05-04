package com.weiye.livedata.collect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class LivedataCollectApplication {

    public static void main(String[] args) {
        SpringApplication.run(LivedataCollectApplication.class, args);
    }

}
