import java.util.*;

public class StudentManager {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void updateStudent(String id, String name, int age) {
        for (Student s : students) {
            if (s.getId().equals(id)) {
                s.setName(name);
                s.setAge(age);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void deleteStudent(String id) {
        students.removeIf(s -> s.getId().equals(id));
    }

    public void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void searchStudent(String id) {
        for (Student s : students) {
            if (s.getId().equals(id)) {
                System.out.println(s);
                return;
            }
        }
        System.out.println("Student not found.");
    }
}
