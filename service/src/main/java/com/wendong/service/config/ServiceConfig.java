package com.wendong.service.config;


import com.wendong.service.component.NumberSeq;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {
    @Bean
    public NumberSeq numberSeq(){
        return new NumberSeq();
    }
}
