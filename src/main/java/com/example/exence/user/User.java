package com.example.exence.user;

import com.example.exence.birthDate.BirthDate;
import com.sun.istack.NotNull;
import org.hibernate.validator.constraints.pl.PESEL;

import javax.persistence.*;
import javax.validation.constraints.Size;


@Entity
@Table(name = "USER")
public class User
{
    //columns
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 2)
    @Column(name = "name")
    private String name;

    @NotNull
    @Size(min = 2)
    @Column(name = "surname")
    private String surname;

    @PESEL
    @NotNull
    @Column(name = "pesel")
    private String pesel;

    @Column(name = "date")
    private String date;

    public User() { };

    //toString
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", pesel='" + pesel + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getDate() {
        return BirthDate.getDay(getPesel()).toString() + "." + BirthDate.getMonth(getPesel()).toString() + "." + BirthDate.getYear(getPesel()).toString();
    }

    public void setDate(String date) {
        this.date = date;
    }
}
