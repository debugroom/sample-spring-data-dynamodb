package org.debugroom.sample.spring.data.dynamodb.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("org.debugroom.sample.spring.data.dynamodb.domain.service")
@Configuration
public class DomainConfig {
}
