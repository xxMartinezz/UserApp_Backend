package com.example.exence.exceptions;

public class UsersNotFoundException extends RuntimeException
{
    public UsersNotFoundException() { }

    public UsersNotFoundException(String message) { super(message); }
}
