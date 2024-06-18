package com.keyin;

import java.util.ArrayList;

public class User {
    private String name;
    private TaskList taskList;
    private static ArrayList<User> users = new ArrayList<>();

    // Constructor
    public User(String name) {
        this.name = name;
        this.taskList = new TaskList();
    }

    public String getName() {
        return name;
    }

    public void addTask(String description) {
        Task task = new Task(description);
        taskList.addTask(task);
    }

    public void markTaskCompleted(String description) {
        boolean success = taskList.markTaskCompleted(description);
        if (success) {
            System.out.println("Task marked as completed.");
        } else {
            System.out.println("Task not found.");
        }
    }

    public void printAllTasks() {
        taskList.printAllTasks();
    }

    public static void addUser(String name) {
        users.add(new User(name));
    }

    public static User findUserByName(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }

    // Static method to print all users (for debugging or informational purposes)
    public static void printAllUsers() {
        for (User user : users) {
            System.out.println(user.getName());
        }
    }
}
