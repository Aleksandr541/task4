package org.example.capp.exceptions;

public class IncorrectDataException extends RuntimeException{
    public IncorrectDataException(String message) {
        System.out.println(message);
    }
}
