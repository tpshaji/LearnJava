import java.io.*;
import java.util.*;

public class TodoListAppArray {
    private static final String FILE_NAME = "todo_list.txt";
    private static List<String> tasks = new ArrayList<>();

    public static void main(String[] args) {
        loadTasks();
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("\nTo-Do List Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addTask(scanner);
                    break;
                case "2":
                    viewTasks();
                    break;
                case "3":
                    deleteTask(scanner);
                    break;
                case "4":
                    saveTasks();
                    System.out.println("Exiting. Your tasks have been saved.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (!choice.equals("4"));

        scanner.close();
    }

    private static void addTask(Scanner scanner) {
        System.out.print("Enter the task description: ");
        String task = scanner.nextLine();
        tasks.add(task);
        System.out.println("Task added successfully.");
    }

    private static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to display.");
            return;
        }

        System.out.println("\nYour To-Do List:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    private static void deleteTask(Scanner scanner) {
        viewTasks();
        if (tasks.isEmpty()) {
            return;
        }

        System.out.print("Enter the number of the task to delete: ");
        int taskNumber = Integer.parseInt(scanner.nextLine());

        if (taskNumber < 1 || taskNumber > tasks.size()) {
            System.out.println("Invalid task number. Please try again.");
        } else {
            tasks.remove(taskNumber - 1);
            System.out.println("Task deleted successfully.");
        }
    }

    private static void loadTasks() {
        File file = new File(FILE_NAME);
        if (file.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    tasks.add(line);
                }
            } catch (IOException e) {
                System.out.println("Error loading tasks: " + e.getMessage());
            }
        }
    }

    private static void saveTasks() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (String task : tasks) {
                writer.write(task);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving tasks: " + e.getMessage());
        }
    }
}
