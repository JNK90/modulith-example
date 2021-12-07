package com.ovsoftware.contextB.usecases.impl;

import com.ovsoftware.contextB.entities.ContextBMessage;
import com.ovsoftware.contextB.usecases.api.ContextBExampleUsecase;

public class ContextBExampleUsecaseImpl implements ContextBExampleUsecase {
    public ContextBMessage exec() {
        return new ContextBMessage("Hello ContextB ExampleUsecase");
    }
}