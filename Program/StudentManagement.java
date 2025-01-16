
//WAP to get Student Details use of class and constructor 
import java.util.*;
class Student {
    private String name;
    private int rollNumber;
    private double[] marks;

    Student(String name, int rollNumber, double[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public double calculateAverage() {
        double total = 0;
        for (double mark : marks) {
            total += mark;
        }
        return total / marks.length;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Average Marks: " + calculateAverage());
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input student details
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        double[] marks = new double[numSubjects];

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
        }

        Student student = new Student(name, rollNumber, marks);
        System.out.println("\nStudent Details:");
        student.displayDetails();

        scanner.close();
    }
}
