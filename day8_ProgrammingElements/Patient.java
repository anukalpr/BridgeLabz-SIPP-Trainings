package day8_ProgrammingElements;

public class Patient {
    private static String hospitalName = "City Hospital";
    private static int totalPatients = 0;

    private String name;
    private int age;
    private String ailment;
    private final int patientID;

    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("-----------------------");
        }
    }

    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    public static void main(String[] args) {
        Patient p1 = new Patient("Alice", 30, "Fever", 101);
        Patient p2 = new Patient("Bob", 45, "Fracture", 102);

        p1.displayDetails();
        p2.displayDetails();

        Patient.getTotalPatients();
    }
}
