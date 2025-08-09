package day8_ProgrammingElements;

public class Employee {
    private static String companyName = "Tech Solutions";
    private static int totalEmployees = 0;
    private String name;
    private final int id;
    private String designation;

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Designation: " + designation);
        }
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("John", 101, "Manager");
        Employee e2 = new Employee("Sarah", 102, "Developer");

        e1.displayDetails();
        System.out.println();
        e2.displayDetails();
        System.out.println();
        Employee.displayTotalEmployees();
    }
}

