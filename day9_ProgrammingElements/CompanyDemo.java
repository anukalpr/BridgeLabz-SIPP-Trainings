package day9_ProgrammingElements;


import java.util.ArrayList;
import java.util.List;

class Employee {
    private String name;
    private String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public void display() {
        System.out.println("Employee: " + name + ", Role: " + role);
    }
}

class Department {
    private String deptName;
    private List<Employee> employees;

    public Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void display() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            e.display();
        }
    }
}

class Company {
    private String companyName;
    private List<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department d) {
        departments.add(d);
    }

    public void display() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.display();
        }
    }
}

public class CompanyDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("John", "Developer");
        Employee e2 = new Employee("Alice", "Tester");
        Employee e3 = new Employee("Bob", "Manager");

        Department dept1 = new Department("IT");
        dept1.addEmployee(e1);
        dept1.addEmployee(e2);

        Department dept2 = new Department("HR");
        dept2.addEmployee(e3);

        Company company = new Company("TechCorp");
        company.addDepartment(dept1);
        company.addDepartment(dept2);

        company.display();
    }
}
