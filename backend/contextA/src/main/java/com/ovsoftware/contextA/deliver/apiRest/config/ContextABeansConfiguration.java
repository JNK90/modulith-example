package com.ovsoftware.contextA.deliver.apiRest.config;

import com.ovsoftware.contextA.usecases.impl.ExampleUsecaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.ovsoftware.contextA.usecases.api.ExampleUsecase;

@Configuration
public class ContextABeansConfiguration {

    @Bean
    public ExampleUsecase getExampleUsecase() {
        return new ExampleUsecaseImpl();
    }
}
