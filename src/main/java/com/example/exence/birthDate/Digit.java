package com.example.exence.birthDate;

public class Digit
{
    //metoda zwracająca cyfrę na określonej pozycji podanej liczby
    public static Long getDigit(Long number, Integer position)
    {
        Long digit = Long.parseLong(number.toString().substring(position, position + 1));
        return digit;
    }
}
