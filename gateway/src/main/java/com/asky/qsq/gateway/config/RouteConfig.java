package com.asky.qsq.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description: 网关路由配置
 * @author: AgainstSky
 * @create: 2022-02-21 16:17
 **/
@Configuration
public class RouteConfig {

    @Bean
    public RouteLocator  customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("demoServiceRouter", r -> r.path("/demo/**")
                        .filters(f -> f.stripPrefix(1))
//                        .filters(f -> f.addResponseHeader("X-CustomerHeader", "kite"))
                        .uri("lb://demo-service"))
//                .uri("http://localhost:9008"))
//                .route("productServiceRouter", r -> r.path("/product/**")
//                        .filters(f -> f.stripPrefix(1))
//                        .uri("lb://product-service"))
//                .route("orderRouter", r -> r.path("/order-service/**")
////                        .filters(f -> f.stripPrefix(1))
//                        .uri("lb://consul-order"))
                .build();
    }



}
