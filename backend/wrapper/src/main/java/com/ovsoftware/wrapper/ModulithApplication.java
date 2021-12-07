package com.ovsoftware.wrapper;

import com.ovsoftware.contextA.deliver.apiRest.config.ContextABeansConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({ContextABeansConfiguration.class})
@ComponentScan(basePackages = {"com.ovsoftware.*"})
public class ModulithApplication {

    public static void main(String[] args) {
        SpringApplication.run(ModulithApplication.class, args);
    }
}
