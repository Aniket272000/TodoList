package Todolist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class todolist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TodoList1 todoList = new TodoList1();

        while (true) {
            System.out.println("Options:");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. View Tasks");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter task name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    Task1 newTask = new Task1(name, description);
                    todoList.addTask(newTask);
                    System.out.println("Task added successfully.");
                    break;
                case 2:
                    System.out.print("Enter the name of the task to remove: ");
                    String taskToRemove = scanner.nextLine();
                    todoList.removeTask(taskToRemove);
                    System.out.println("Task removed successfully.");
                    break;
                case 3:
                    todoList.viewTasks();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}

