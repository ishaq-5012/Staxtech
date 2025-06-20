import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskManager tm = new TaskManager();
        int choice;

        do {
            System.out.println("\n--- To-Do List App ---");
            System.out.println("1. Add Task");
            System.out.println("2. Mark Task as Done");
            System.out.println("3. Delete Task");
            System.out.println("4. View Tasks");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    String title = sc.nextLine();
                    tm.addTask(title);
                    break;
                case 2:
                    System.out.print("Enter task number to mark done: ");
                    int doneIndex = sc.nextInt() - 1;
                    tm.markDone(doneIndex);
                    break;
                case 3:
                    System.out.print("Enter task number to delete: ");
                    int delIndex = sc.nextInt() - 1;
                    tm.deleteTask(delIndex);
                    break;
                case 4:
                    tm.viewTasks();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);
        sc.close();
    }
}
