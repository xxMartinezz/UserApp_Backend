package com.example.exence.birthDate;

public class BirthDate
{
    //metoda pozwalająca uzyskać rok urodzenia na podstawie numeru pesel
    public static Long getYear(String pesel)
    {
        Long year, month;

        Long number = Long.parseLong(pesel);
        year = 10 * Digit.getDigit(number, 0);
        year += Digit.getDigit(number, 1);
        month = 10 * Digit.getDigit(number, 2);
        month += Digit.getDigit(number, 3);

        //Określenie roku na podstawie miesiąca
        if(month > 80 && month < 93) year += 1800;
        else if(month > 0 && month < 13) year += 1900;
        else if(month > 20 && month < 33) year += 2000;
        else if(month > 40 && month < 53) year += 2100;
        else if(month > 60 && month < 73) year += 2200;
        return year;
    }

    //metoda pozwalająca uzyskać miesiąc urodzenia na podstawie numeru pesel
    public static Long getMonth(String pesel)
    {
        Long month;

        Long number = Long.parseLong(pesel);
        month = 10 * Digit.getDigit(number, 2);
        month += Digit.getDigit(number, 3);

        //Określenie miesiąca
        if(month > 80 && month < 93) month -= 80;
        else if(month > 20 && month < 33) month -= 20;
        else if(month > 40 && month < 53) month -= 40;
        else if(month > 60 && month < 73) month -= 60;
        return month;
    }

    //metoda pozwalająca uzyskać dzień urodzenia na podstawie numeru pesel
    public static Long getDay(String pesel)
    {
        Long day;

        Long number = Long.parseLong(pesel);
        day = 10 * Digit.getDigit(number, 4);
        day += Digit.getDigit(number, 5);

        return day;
    }
}
