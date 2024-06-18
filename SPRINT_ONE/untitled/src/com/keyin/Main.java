package com.keyin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Create User");
            System.out.println("2. Add Task");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. View Tasks");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter user name: ");
                    String name = scanner.nextLine();
                    User.addUser(name);
                    break;
                case 2:
                    System.out.print("Enter user name: ");
                    name = scanner.nextLine();
                    User user = User.findUserByName(name);
                    if (user != null) {
                        System.out.print("Enter task description: ");
                        String description = scanner.nextLine();
                        user.addTask(description);
                    } else {
                        System.out.println("User not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter user name: ");
                    name = scanner.nextLine();
                    user = User.findUserByName(name);
                    if (user != null) {
                        System.out.print("Enter task description to mark as completed: ");
                        String description = scanner.nextLine();
                        user.markTaskCompleted(description);
                    } else {
                        System.out.println("User not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter user name: ");
                    name = scanner.nextLine();
                    user = User.findUserByName(name);
                    if (user != null) {
                        user.printAllTasks();
                    } else {
                        System.out.println("User not found.");
                    }
                    break;
                case 5:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
