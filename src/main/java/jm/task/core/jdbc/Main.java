package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Max", "Pain", (byte)35);
        userService.saveUser("Alex", "Girko", (byte) 27);
        userService.saveUser("Luk", "Uoker", (byte) 22);
        userService.saveUser("Steve", "Jobs", (byte) 55);
        for (User u : userService.getAllUsers()) {
            System.out.println(u);
        }
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
