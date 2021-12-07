package com.ovsoftware.contextA.usecases.impl;

import com.ovsoftware.contextA.entities.ContextAMessage;
import com.ovsoftware.contextA.usecases.api.ContextAExampleUsecase;

public class ContextAExampleUsecaseImpl implements ContextAExampleUsecase {
    public ContextAMessage exec() {
        return new ContextAMessage("Hello ContextA ExampleUsecase");
    }
}