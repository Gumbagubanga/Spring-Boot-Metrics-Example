package com.example;

import com.ryantenney.metrics.spring.config.annotation.EnableMetrics;
import com.ryantenney.metrics.spring.config.annotation.MetricsConfigurerAdapter;

import org.springframework.context.annotation.Configuration;

// Not setting `proxyTargetClass = true` will result in an error on calling annotated controller!
@EnableMetrics(proxyTargetClass = true)
@Configuration
public class WebConfig extends MetricsConfigurerAdapter {


}
