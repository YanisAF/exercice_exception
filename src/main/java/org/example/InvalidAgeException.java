package org.example;

public class InvalidAgeException extends Exception {
    public InvalidAgeException(int age,String message) {
        super(message);
    }
}
