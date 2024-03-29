package com.galvanize.gmdb.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GmdbGatewaySvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmdbGatewaySvcApplication.class, args);
    }



}
