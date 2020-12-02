package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class MainHibernate {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Alex", "Vox", (byte)33);
        userService.saveUser("Mike", "Wazowsky", (byte)26);
        userService.saveUser("Edvard", "Green", (byte)45);
        userService.saveUser("Glen", "Kobyakov", (byte)14);
        List<User> list = userService.getAllUsers();
        for (User u : list) {
            System.out.println(u);
        }
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
