package com.example.exence.exceptions;

public class UsersNotFoundException extends Exception
{
    public UsersNotFoundException() { }

    public UsersNotFoundException(String message) { super(message); }
}
