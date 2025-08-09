package day7_ProgrammingElements;

public class Student {
    public int rollNumber;
    protected String name;
    private double cgpa;

    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    public double getCGPA() {
        return cgpa;
    }

    public void setCGPA(double cgpa) {
        if (cgpa >= 0.0 && cgpa <= 10.0) {
            this.cgpa = cgpa;
        }
    }

    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
    }
}

class PostgraduateStudent extends Student {
    private String specialization;

    public PostgraduateStudent(int rollNumber, String name, double cgpa, String specialization) {
        super(rollNumber, name, cgpa);
        this.specialization = specialization;
    }

    public void displayPGDetails() {
        System.out.println("Postgraduate Student Name: " + name);
        System.out.println("Specialization: " + specialization);
        System.out.println("CGPA: " + getCGPA());
    }
}

class Main {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Alice", 8.5);
        s1.displayDetails();
        s1.setCGPA(9.0);
        System.out.println("\nUpdated CGPA: " + s1.getCGPA());

        System.out.println("\n--- Postgraduate Student ---");
        PostgraduateStudent pg1 = new PostgraduateStudent(201, "Bob", 9.2, "Computer Science");
        pg1.displayPGDetails();
    }
}
