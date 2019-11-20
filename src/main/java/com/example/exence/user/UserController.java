package com.example.exence.user;

import com.example.exence.exceptions.NameNotCorrectException;
import com.example.exence.exceptions.PeselNotCorrectException;
import com.example.exence.exceptions.UsersNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController
{
    @Autowired
    private UserRepository userRepository;

    @GetMapping("")
    public Page<User> findAll(Pageable pageable)
    {
        Page<User> users = userRepository.findAll(pageable);
        if(users.isEmpty())
        {
            throw new UsersNotFoundException("Brak użytkowników w bazie");
        }
        else return userRepository.findAll(pageable);
    }

    @PostMapping("/new")
    public User create(@RequestBody User user)
    {
        if(user.getName().length() < 2)
        {
            throw new NameNotCorrectException("Imię posiada za mało znaków. Minimalna liczba znaków: 2");
        }
        else if(user.getSurname().length() < 2)
        {
            throw new NameNotCorrectException("Nazwisko posiada za mało znaków. Minimalna liczba znaków: 2");
        }
        else if(user.getPesel().length() != 11)
        {
            throw new PeselNotCorrectException("Pesel posiada nieodpowiednią liczbę znaków. Wymagana liczba znaków: 11");
        }
        else
        {
            long x = 0;
            try
            {
                x = Long.parseLong(user.getPesel());
                return userRepository.save(user);
            }
            catch (Exception e)
            {
                throw new PeselNotCorrectException("Pesel posiada znaki niedozwolone");
            }
        }
    }
}
