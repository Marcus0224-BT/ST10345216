/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Task;

/**
 *
 * @author Marcus
 */
public class TaskTest {
    private Task task1;
    private Task task2;

    //Before
    public void setUp() {
        // Create Task 1
        task1 = new Task("Login Feature", "Create Login to authenticate users", "Tsholofelo Sithole", 8, "To Do");
        
        // Create Task 2
        task2 = new Task("Add Task Feature", "Create Add Task feature to add task users", "Mike Brown", 10, "To Do");
    }

    //Test
    public void testCheckTaskDescription() {
        // Test valid description
        assertTrue("Task description should be valid", task1.checkTaskDescription());
        assertTrue("Task description should be valid", task2.checkTaskDescription());

        // Create a task with an invalid description
        Task invalidTask = new Task("Invalid Task", "This description is way too long and exceeds fifty characters.", "Test Developer", 5, "To Do");
        assertFalse("Task description should be invalid", invalidTask.checkTaskDescription());
    }

    //Test
    public void testCreateTaskID() {
        String expectedTaskID1 = "LO:0:SON"; // LO for Login, 0 for task number, SON for Harrison
        String expectedTaskID2 = "AD:1:ITH"; // AD for Add, 1 for task number, ITH for Smith
        
        assertEquals("Task ID should match expected format", expectedTaskID1, task1.createTaskID());
        assertEquals("Task ID should match expected format", expectedTaskID2, task2.createTaskID());
    }

    //Test
    public void testPrintTaskDetails() {
        String expectedDetails1 = """
                                  Task Status: To Do
                                  Developer Details: Robyn Harrison
                                  Task Number: 0
                                  Task Name: Login Feature
                                  Task Description: Create Login to authenticate users
                                  Task ID: LO:0:SON
                                  Duration: 8 hours""";
        
        String expectedDetails2 = """
                                  Task Status: To Do
                                  Developer Details: Mike Smith
                                  Task Number: 1
                                  Task Name: Add Task Feature
                                  Task Description: Create Add Task feature to add task users
                                  Task ID: AD:1:ITH
                                  Duration: 10 hours""";
        
        assertEquals("Task details should match expected format", expectedDetails1, task1.printTaskDetails());
        assertEquals("Task details should match expected format", expectedDetails2, task2.printTaskDetails());
    }

    //Test
    public void testReturnTotalHours() {
        assertEquals("Total hours for task 1 should be 8", 8, task1.returnTotalHours());
        assertEquals("Total hours for task 2 should be 10", 10, task2.returnTotalHours());
    }

    private void assertTrue(String task_description_should_be_valid, boolean checkTaskDescription) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void assertFalse(String task_description_should_be_invalid, boolean checkTaskDescription) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void assertEquals(String task_ID_should_match_expected_format, String expectedTaskID1, String createTaskID) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void assertEquals(String total_hours_for_task_1_should_be_8, int i, int returnTotalHours) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

