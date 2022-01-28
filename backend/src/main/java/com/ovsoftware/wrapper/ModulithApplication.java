package com.ovsoftware.wrapper;

import com.ovsoftware.contextA.deliver.apiRest.config.ContextABeansConfiguration;
import com.ovsoftware.contextB.apiRest.config.ContextBBeansConfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({
        ContextABeansConfiguration.class,
        ContextBBeansConfiguration.class
})
@ComponentScan(basePackages = {"com.ovsoftware.*"})
public class ModulithApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModulithApplication.class, args);
    }
}
