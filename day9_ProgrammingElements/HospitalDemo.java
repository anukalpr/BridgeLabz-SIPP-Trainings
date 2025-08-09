package day9_ProgrammingElements;

import java.util.ArrayList;
import java.util.List;

class Patient {
    private String name;
    private List<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDoctor(Doctor d) {
        if (!doctors.contains(d)) {
            doctors.add(d);
        }
    }

    public void displayDoctors() {
        System.out.println("Patient: " + name + " - Doctors:");
        for (Doctor d : doctors) {
            System.out.println(d.getName());
        }
    }
}

class Doctor {
    private String name;
    private List<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addPatient(Patient p) {
        if (!patients.contains(p)) {
            patients.add(p);
        }
    }

    public void consult(Patient p) {
        System.out.println("Doctor " + name + " is consulting patient " + p.getName());
        addPatient(p);
        p.addDoctor(this);
    }

    public void displayPatients() {
        System.out.println("Doctor: " + name + " - Patients:");
        for (Patient p : patients) {
            System.out.println(p.getName());
        }
    }
}

class Hospital {
    private String hospitalName;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor d) {
        doctors.add(d);
    }

    public void addPatient(Patient p) {
        patients.add(p);
    }

    public void displayDetails() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Doctors:");
        for (Doctor d : doctors) {
            System.out.println(d.getName());
        }
        System.out.println("Patients:");
        for (Patient p : patients) {
            System.out.println(p.getName());
        }
    }
}

public class HospitalDemo {
    public static void main(String[] args) {
        Doctor d1 = new Doctor("Dr. Smith");
        Doctor d2 = new Doctor("Dr. Johnson");

        Patient p1 = new Patient("Alice");
        Patient p2 = new Patient("Bob");

        Hospital hospital = new Hospital("City Hospital");
        hospital.addDoctor(d1);
        hospital.addDoctor(d2);
        hospital.addPatient(p1);
        hospital.addPatient(p2);

        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);

        hospital.displayDetails();
        d1.displayPatients();
        d2.displayPatients();
        p1.displayDoctors();
        p2.displayDoctors();
    }
}

