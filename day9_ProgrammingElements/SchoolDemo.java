package day9_ProgrammingElements;

import java.util.ArrayList;
import java.util.List;

class Course {
    private String courseName;
    private List<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(Student s) {
        if (!students.contains(s)) {
            students.add(s);
            s.addCourse(this);
        }
    }

    public void displayStudents() {
        System.out.println("Course: " + courseName + " - Enrolled Students:");
        for (Student s : students) {
            System.out.println(s.getName());
        }
    }
}

class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addCourse(Course c) {
        if (!courses.contains(c)) {
            courses.add(c);
        }
    }

    public void enroll(Course c) {
        c.addStudent(this);
    }

    public void displayCourses() {
        System.out.println("Student: " + name + " - Courses:");
        for (Course c : courses) {
            System.out.println(c.getCourseName());
        }
    }
}

class School {
    private String schoolName;
    private List<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void displayStudents() {
        System.out.println("School: " + schoolName + " - Students:");
        for (Student s : students) {
            System.out.println(s.getName());
        }
    }
}

public class SchoolDemo {
    public static void main(String[] args) {
        Course math = new Course("Mathematics");
        Course science = new Course("Science");
        Course english = new Course("English");

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        s1.enroll(math);
        s1.enroll(science);

        s2.enroll(english);
        s2.enroll(math);

        School school = new School("Greenwood High");
        school.addStudent(s1);
        school.addStudent(s2);

        school.displayStudents();

        s1.displayCourses();
        s2.displayCourses();

        math.displayStudents();
        science.displayStudents();
        english.displayStudents();
    }
}

