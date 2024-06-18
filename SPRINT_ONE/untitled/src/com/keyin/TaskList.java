package com.keyin;

public class TaskList {

    private class Node {
        Task task;
        Node next;

        public Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    private Node head;

    public TaskList(){
        this.head = null;
    }

    public void addTask(Task task){
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public boolean markTaskCompleted(String description){
        Node current = head;
        while (current != null) {
            if (current.task.getDescription() != null && current.task.getDescription().equals(description)) {
                current.task.markTaskCompleted();
                return true;
            }
            current = current.next;
        }
        return false; // task not found
    }

    public void printAllTasks() {
        Node current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }
}