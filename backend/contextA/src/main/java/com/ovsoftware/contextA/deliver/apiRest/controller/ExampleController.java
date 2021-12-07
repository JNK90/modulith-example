package com.ovsoftware.contextA.deliver.apiRest.controller;


import com.ovsoftware.contextA.entities.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ovsoftware.contextA.usecases.api.ExampleUsecase;

@RestController()
@RequestMapping("contextA")
public class ExampleController {

    private final ExampleUsecase exampleUsecase;

    @Autowired
    public ExampleController(ExampleUsecase exampleUsecase) {
        this.exampleUsecase = exampleUsecase;
    }

    @GetMapping(value = "/message", produces = { "application/json" })
    public Message getMessage() {
        return exampleUsecase.exec();
    }
}
