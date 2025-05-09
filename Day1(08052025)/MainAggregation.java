class Student {
    String name;
    int rollNumber;
 
    Student(String name, int rollNumber) {
this.name = name;
        this.rollNumber = rollNumber;
    }
 
    void display() {
        System.out.println("Student: " + name + ", Roll No: " + rollNumber);
    }
}
 
class School {
    String name;
    Student[] students; 
 
    School(String name, Student[] students) {
this.name = name;
        this.students = students;
    }
 
    void showDetails() {
        System.out.println("School Name: " + name);
        System.out.println("Students Enrolled:");
        for (Student s : students) {
            s.display(); 
        }
    }
}
 
public class MainAggregation{
    public static void main(String[] args) {
        
        Student s1 = new Student("Kushal", 101);
        Student s2 = new Student("Kumar", 102);
        Student s3 = new Student("Palli", 103);
 
        
        Student[] studentArray = {s1, s2, s3};
 
       
        School school = new School("I-Exceed High school", studentArray);
 
        school.showDetails();
    }
}