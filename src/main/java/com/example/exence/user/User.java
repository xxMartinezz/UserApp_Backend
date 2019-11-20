package com.example.exence.user;

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

    //constructors
    public User(String name, String surname, String pesel)
    {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
    };

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

    public void setId(Long id) {
        this.id = id;
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
}
