package com.example.exence.exceptions;

public class PeselNotCorrectException extends RuntimeException
{
    public PeselNotCorrectException() { }

    public PeselNotCorrectException(String message) { super(message); }
}
