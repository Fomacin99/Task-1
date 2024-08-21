package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Vova", "Pupkin", (byte) 25);
        userService.saveUser("Dima", "Putin", (byte) 28);
        userService.saveUser("Roma", "Efimov", (byte) 26);
        userService.saveUser("Pasha", "Avdeev", (byte) 23);
        userService.removeUserById(1);
        userService.getAllUsers().forEach(System.out::println);
        userService.cleanUsersTable();
        userService.dropUsersTable();

    }
}
