package day7_ProgrammingElements;

public class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    private String teamName;

    public Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }

    public void displayManagerDetails() {
        System.out.println("Manager ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Team: " + teamName);
        System.out.println("Salary: " + getSalary());
    }
}

class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Finance", 50000);
        e1.displayEmployeeDetails();
        e1.setSalary(55000);
        System.out.println("\nUpdated Salary: " + e1.getSalary());

        System.out.println("\n--- Manager Details ---");
        Manager m1 = new Manager(201, "IT", 80000, "Development");
        m1.displayManagerDetails();
    }
}
