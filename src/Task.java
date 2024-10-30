/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Task;



/**
 *
 * @author Marcus
 */


public final class Task {
    private static int taskCounter = 0; // To auto-generate task numbers
    private final String taskName;
    private final String taskDescription;
    private final String developerDetails;
    private final int duration;
    private final String taskStatus;
    private final String taskID;

    public Task(String taskName, String taskDescription, String developerDetails, int duration, String taskStatus) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.developerDetails = developerDetails;
        this.duration = duration;
        this.taskStatus = taskStatus;
        this.taskID = createTaskID();
        taskCounter++; // Increment task number
    }

    public boolean checkTaskDescription() {
        return taskDescription.length() <= 50;
    }

    public String createTaskID() {
        String namePart = taskName.substring(0, 2).toUpperCase();
        String devPart = developerDetails.substring(developerDetails.length() - 3).toUpperCase();
        return namePart + ":" + (taskCounter - 1) + ":" + devPart; // Task number is taskCounter - 1
    }

    public String printTaskDetails() {
        return "Task Status: " + taskStatus + "\n" +
               "Developer Details: " + developerDetails + "\n" +
               "Task Number: " + (taskCounter - 1) + "\n" +
               "Task Name: " + taskName + "\n" +
               "Task Description: " + taskDescription + "\n" +
               "Task ID: " + taskID + "\n" +
               "Duration: " + duration + " hours";
    }

    public int returnTotalHours() {
        return duration;
    }
}