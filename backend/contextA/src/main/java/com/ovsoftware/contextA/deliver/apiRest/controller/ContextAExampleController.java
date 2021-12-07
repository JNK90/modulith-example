package com.ovsoftware.contextA.deliver.apiRest.controller;


import com.ovsoftware.contextA.entities.ContextAMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ovsoftware.contextA.usecases.api.ContextAExampleUsecase;

@RestController()
@RequestMapping("contextA")
public class ContextAExampleController {

    private final ContextAExampleUsecase exampleUsecase;

    @Autowired
    public ContextAExampleController(ContextAExampleUsecase exampleUsecase) {
        this.exampleUsecase = exampleUsecase;
    }

    @GetMapping(value = "/message", produces = { "application/json" })
    public ContextAMessage getMessage() {
        return exampleUsecase.exec();
    }
}
