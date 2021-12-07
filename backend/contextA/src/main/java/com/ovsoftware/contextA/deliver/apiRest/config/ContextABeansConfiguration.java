package com.ovsoftware.contextA.deliver.apiRest.config;

import com.ovsoftware.contextA.usecases.impl.ContextAExampleUsecaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.ovsoftware.contextA.usecases.api.ContextAExampleUsecase;

@Configuration
public class ContextABeansConfiguration {

    @Bean
    public ContextAExampleUsecase getContextAExampleUsecase() {
        return new ContextAExampleUsecaseImpl();
    }
}
