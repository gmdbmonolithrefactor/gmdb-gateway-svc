package com.galvanize.gmdb.gateway;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.discovery.DiscoveryClientRouteDefinitionLocator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableDiscoveryClient
public class GatewayDiscoveryConfiguration {
//    @Bean
//    public DiscoveryClientRouteDefinitionLocator
//    discoveryClientRouteLocator(DiscoveryClient discoveryClient) {
//
//        return new DiscoveryClientRouteDefinitionLocator(discoveryClient);
//    }

}

