package com.keyin;

public class Task {

    public String description;
    public boolean isCompleted;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public Task() {
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




