package com.ovsoftware.contextB.apiRest.controller;


import com.ovsoftware.contextB.entities.ContextBMessage;
import com.ovsoftware.contextB.usecases.api.ContextBExampleUsecase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("contextB")
public class ContextBExampleController {

    private final ContextBExampleUsecase exampleUsecase;

    @Autowired
    public ContextBExampleController(ContextBExampleUsecase exampleUsecase) {
        this.exampleUsecase = exampleUsecase;
    }

    @GetMapping(value = "/message", produces = { "application/json" })
    public ContextBMessage getMessage() {
        return exampleUsecase.exec();
    }
}
