package day6_ProgrammingElements;

public class Student {
    private String name;
    private int rollNumber;
    private double marks;

    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public char calculateGrade() {
        if (marks >= 90) return 'A';
        else if (marks >= 75) return 'B';
        else if (marks >= 60) return 'C';
        else if (marks >= 40) return 'D';
        else return 'F';
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Marks       : " + marks);
        System.out.println("Grade       : " + calculateGrade());
    }

    public static void main(String[] args) {
        Student student1 = new Student("Rahul Sharma", 101, 88.5);
        Student student2 = new Student("Priya Singh", 102, 59.0);
        student1.displayDetails();
        System.out.println();
        student2.displayDetails();
    }
}

