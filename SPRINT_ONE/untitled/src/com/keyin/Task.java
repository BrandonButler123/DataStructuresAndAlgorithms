package com.keyin;

public class Task {
    public String description;
    public boolean isCompleted;

    public String getDescription() {
        return description;
    }

    public Task(String description) {
        this.description = description;
        this.isCompleted = false;
    }

    public void markTaskCompleted() {
        this.isCompleted = true;
        }

    @Override
    public String toString() {
        return description + " [" + (isCompleted ? "Completed" : "Pending") + "]";
    }
}




