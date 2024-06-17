package com.keyin;

public class Main {
    public static void main(String[] args) {
        Task task1 = new Task();
        Task task2 = new Task();

        task1.setDescription("Mow the lawn");
        task2.setDescription("Walk the dog");
        task1.markTaskCompleted();
        System.out.println(task1.toString());
        System.out.println(task2.toString());





    }
}
