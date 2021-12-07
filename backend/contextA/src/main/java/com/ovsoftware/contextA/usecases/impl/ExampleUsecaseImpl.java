package com.ovsoftware.contextA.usecases.impl;

import com.ovsoftware.contextA.entities.Message;
import com.ovsoftware.contextA.usecases.api.ExampleUsecase;

public class ExampleUsecaseImpl implements ExampleUsecase {
    public Message exec() {
        return new Message("Hello ContextA ExampleUsecase");
    }
}