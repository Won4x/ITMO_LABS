package org.example;

public class Inventingexception extends Exception {
    public Inventingexception(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Ошибка обучения: " + super.getMessage();
    }
}
