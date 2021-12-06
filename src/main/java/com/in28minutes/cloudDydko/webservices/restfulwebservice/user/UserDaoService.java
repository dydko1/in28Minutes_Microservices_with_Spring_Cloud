package com.in28minutes.cloudDydko.webservices.restfulwebservice.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    //private static int usersCount = users.size();
    private static int usersCount = 0;

    static {
        System.out.println("add users!!!\n");
        users.add(new User(1, "Mirek", new Date()));
        users.add(new User(2, "Anna", new Date()));
        users.add(new User(3, "Natalia", new Date()));
        users.add(new User(4, "Dawid", new Date()));
    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user) {
        if (user.getId() == null) {
            //System.out.println("Value is null, Miro: " + users.size());
            usersCount = users.size();
            user.setId(++usersCount); //) + 100);
        }
        users.add(user);
        return user;
    }

    public User findOne(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }
}
