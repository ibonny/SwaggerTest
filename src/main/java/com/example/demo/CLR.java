package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CLR implements CommandLineRunner {
    @Autowired
    UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(args);

        if (args.length == 0) {
            System.out.println("Please pass a command.");

            System.exit(0);
        }

        if (args[0] == "adduser") {
            User newUser = new User();

            newUser.setFirstName(args[1]);
            newUser.setLastName(args[2]);

            repository.save(newUser);

            System.out.println("User added.");
        }

        if (args[0] == "list") {
            System.out.println("Here are the users:");

            List<User> users = repository.findAll();

            System.out.println(users);
        }

        System.exit(0);
    }
}
