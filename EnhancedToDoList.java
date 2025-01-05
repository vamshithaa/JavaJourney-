import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Task {
    String description;
    String priority;
    boolean isCompleted;

    Task(String description, String priority) {
        this.description = description;
        this.priority = priority;
        this.isCompleted = false;
    }

    @Override
    public String toString() {
        String status = isCompleted ? "[✓]" : "[ ]";
        String colorCode = switch (priority.toLowerCase()) {
            case "high" -> "\u001B[31m"; // Red
            case "medium" -> "\u001B[33m"; // Yellow
            case "low" -> "\u001B[32m"; // Green
            default -> "\u001B[0m"; // Reset
        };
        return colorCode + status + " " + description + " (Priority: " + priority + ")" + "\u001B[0m";
    }
}

public class EnhancedToDoList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Task> tasks = new ArrayList<>();
        int choice;

        System.out.println("Welcome to the Enhanced To-Do List Manager!");
        do {
            System.out.println("\n1. Add a Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Delete a Task");
            System.out.println("5. Search for a Task");
            System.out.println("6. Save Tasks to File");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (choice) {
                case 1 -> addTask(scanner, tasks);
                case 2 -> viewTasks(tasks);
                case 3 -> markTaskAsCompleted(scanner, tasks);
                case 4 -> deleteTask(scanner, tasks);
                case 5 -> searchTask(scanner, tasks);
                case 6 -> saveTasksToFile(tasks);
                case 7 -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);

        scanner.close();
    }

    private static void addTask(Scanner scanner, ArrayList<Task> tasks) {
        System.out.print("Enter the task description: ");
        String description = scanner.nextLine();
        System.out.print("Enter the priority (High/Medium/Low): ");
        String priority = scanner.nextLine();
        tasks.add(new Task(description, priority));
        System.out.println("Task added successfully!");
    }

    private static void viewTasks(ArrayList<Task> tasks) {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available!");
            return;
        }
        System.out.println("\nYour To-Do List:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    private static void markTaskAsCompleted(Scanner scanner, ArrayList<Task> tasks) {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available to mark as completed!");
            return;
        }
        viewTasks(tasks);
        System.out.print("Enter the task number to mark as completed: ");
        int taskNumber = scanner.nextInt();
        if (taskNumber > 0 && taskNumber <= tasks.size()) {
            tasks.get(taskNumber - 1).isCompleted = true;
            System.out.println("Task marked as completed!");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    private static void deleteTask(Scanner scanner, ArrayList<Task> tasks) {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available to delete!");
            return;
        }
        viewTasks(tasks);
        System.out.print("Enter the task number to delete: ");
        int taskNumber = scanner.nextInt();
        if (taskNumber > 0 && taskNumber <= tasks.size()) {
            tasks.remove(taskNumber - 1);
            System.out.println("Task deleted successfully!");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    private static void searchTask(Scanner scanner, ArrayList<Task> tasks) {
        System.out.print("Enter a keyword to search: ");
        String keyword = scanner.nextLine().toLowerCase();
        System.out.println("\nSearch Results:");
        boolean found = false;
        for (Task task : tasks) {
            if (task.description.toLowerCase().contains(keyword)) {
                System.out.println(task);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No tasks found matching the keyword.");
        }
    }

    private static void saveTasksToFile(ArrayList<Task> tasks) {
        try (FileWriter writer = new FileWriter("tasks.txt")) {
            for (Task task : tasks) {
                writer.write(task + "\n");
            }
            System.out.println("Tasks saved to 'tasks.txt' successfully!");
        } catch (IOException e) {
            System.out.println("Error saving tasks to file: " + e.getMessage());
        }
    }
}
