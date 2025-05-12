import java.util.*;

class University {
    String universityName;

    University(String name) {
        this.universityName = name;
    }

    // Static nested class for departments
    static class Department {
        static void displayDepartments() {
            System.out.println("Available Departments:");
            System.out.println("- Computer Science");
            System.out.println("- Electrical Engineering");
            System.out.println("- Mechanical Engineering");
            System.out.println("- Civil Engineering");
        }
    }

    // Non-static inner class for students
    class Student {
        String name;
        int id;
        String department;

        Student(String name, int id, String dept) {
            this.name = name;
            this.id = id;
            this.department = dept;
        }

        void displayStudent() {
            System.out.println("University: " + universityName);
            System.out.println("Student Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Department: " + department);
        }
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Use the static nested class
        University.Department.displayDepartments();

        System.out.print("\nEnter university name: ");
        String uniName = sc.nextLine();

        University myUniversity = new University(uniName);

        // Add students
        System.out.print("Enter number of students to add: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        List<University.Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Enter department: ");
            String dept = sc.nextLine();

            University.Student s = myUniversity.new Student(name, id, dept);
            students.add(s);
        }

        // Display students
        System.out.println("\n--- Student Records ---");
        for (University.Student s : students) {
            s.displayStudent();
            System.out.println("---------------------");
        }

        sc.close();
    }
}
