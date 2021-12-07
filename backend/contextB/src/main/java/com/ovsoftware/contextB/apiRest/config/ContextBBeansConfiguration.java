package com.ovsoftware.contextB.apiRest.config;

import com.ovsoftware.contextB.usecases.api.ContextBExampleUsecase;
import com.ovsoftware.contextB.usecases.impl.ContextBExampleUsecaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextBBeansConfiguration {

    @Bean
    public ContextBExampleUsecase getContextBExampleUsecase() {
        return new ContextBExampleUsecaseImpl();
    }
}
