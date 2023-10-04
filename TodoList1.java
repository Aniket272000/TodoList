package Todolist;

import java.util.ArrayList;
import java.util.List;

public class TodoList1 {
	
	private List<Task1> tasks = new ArrayList<>();

    public void addTask(Task1 task) {
        tasks.add(task);
    }

    public void removeTask(String taskName) {
        tasks.removeIf(task -> task.getName().equalsIgnoreCase(taskName));
    }

    public void viewTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            Task1 task = tasks.get(i);
            System.out.println("Task #" + (i + 1));
            System.out.println("Name: " + task.getName());
            System.out.println("Description: " + task.getDescription());
            System.out.println();
        }
    }

}
