package com.shoesclick.bff.site.shoes.config;

import com.shoesclick.bff.site.shoes.config.properties.CacheProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(CacheProperties.class)
public class BffSiteShoesConfig {
}
