package com.jairo.projeto_java_web.Services.Exeptions;

public class ResourceNotFoundExeception extends RuntimeException {
    public ResourceNotFoundExeception(String message) {
        super(message);
    }
}
