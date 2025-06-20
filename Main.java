import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager sm = new StudentManager();
        int choice;

        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. View All Students");
            System.out.println("5. Search Student by ID");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sm.addStudent(new Student(id, name, age));
                    break;
                case 2:
                    System.out.print("Enter ID to update: ");
                    id = sc.nextLine();
                    System.out.print("Enter new Name: ");
                    name = sc.nextLine();
                    System.out.print("Enter new Age: ");
                    age = sc.nextInt();
                    sm.updateStudent(id, name, age);
                    break;
                case 3:
                    System.out.print("Enter ID to delete: ");
                    id = sc.nextLine();
                    sm.deleteStudent(id);
                    break;
                case 4:
                    sm.viewAllStudents();
                    break;
                case 5:
                    System.out.print("Enter ID to search: ");
                    id = sc.nextLine();
                    sm.searchStudent(id);
                    break;
                case 0:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);
        sc.close();
    }
}
