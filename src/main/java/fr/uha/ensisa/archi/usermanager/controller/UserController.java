package fr.uha.ensisa.archi.usermanager.controller;

import fr.uha.ensisa.archi.usermanager.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    List<User> users = new ArrayList<>();

    public UserController() {
        User jack = new User("jack", "sparrow", 10293847);
        users.add(jack);
        users.add(new User("fred", "do", 10));
        users.add(new User("julie", "XYZ", 999));
        users.add(new User("myke", "Tyson", 123456));

        System.out.println(users);
    }


    @GetMapping("/user/{id}")
    public User getByID(@PathVariable int id) {
        return this.users.get(id);
    }

    @GetMapping("/user")
    public List<User> getAll() {
        return this.users;
    }

    @GetMapping("/user/addRandom")
    public User addRandom() {
        User user = new User();


        this.users.add(user);
        return user;
    }


    @GetMapping("/user/withdraw/{id}/{amount}")
    public User withdraw(@PathVariable int id, @PathVariable int amount) {
        User user = this.users.get(id);
        user.setFinancialCapital(user.getFinancialCapital() - amount);
        if (user.getFinancialCapital() < 0) {
            user.setFinancialCapital(0);
        }
        return user;
    }

    @GetMapping("/user/deposit/{id}/{amount}")
    public User deposit(@PathVariable int id, @PathVariable int amount) {
        User user = this.users.get(id);
        user.setFinancialCapital(user.getFinancialCapital() + amount);
        return user;
    }

}