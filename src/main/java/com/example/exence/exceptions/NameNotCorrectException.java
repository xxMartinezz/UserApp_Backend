package com.example.exence.exceptions;

public class NameNotCorrectException extends RuntimeException
{
    public NameNotCorrectException() { }

    public NameNotCorrectException(String message) { super(message); }
}
