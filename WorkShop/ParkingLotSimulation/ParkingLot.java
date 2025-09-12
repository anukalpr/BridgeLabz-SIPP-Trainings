package ParkingLotSimulation;


import java.util.*;

class ParkingFullException extends Exception {
    public ParkingFullException(String message) {
        super(message);
    }
}

public class ParkingLot {
    static int MAX_CAPACITY = 6;
    static String[] parkingLot = new String[MAX_CAPACITY];
    static int count = 0;

    public static void parkCar(String carNumber) throws ParkingFullException {
        if (count >= MAX_CAPACITY) {
            throw new ParkingFullException("Parking lot is full! Cannot park car: " + carNumber);
        }
        parkingLot[count] = carNumber;
        count++;
        System.out.println("Car " + carNumber + " parked successfully.");
    }

    public static void unparkCar(String carNumber) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (parkingLot[i].equals(carNumber)) {
                found = true;
                for (int j = i; j < count - 1; j++) {
                    parkingLot[j] = parkingLot[j + 1];
                }
                parkingLot[count - 1] = null;
                count--;
                System.out.println("Car " + carNumber + " unparked successfully.");
                break;
            }
        }
        if (!found) {
            System.out.println("Car number " + carNumber + " not found in the parking lot.");
        }
    }

    public static void displayParkingLot() {
        System.out.println("Current cars in parking:");
        if (count == 0) {
            System.out.println("Parking lot is empty.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println((i + 1) + ". " + parkingLot[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("\n----- Car Parking System -----");
            System.out.println("1. Park Car");
            System.out.println("2. Unpark Car");
            System.out.println("3. View Parking Lot");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter car number to park: ");
                    String car = sc.nextLine();
                    try {
                        parkCar(car);
                    } catch (ParkingFullException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Enter car number to unpark: ");
                    String carUnpark = sc.nextLine();
                    unparkCar(carUnpark);
                    break;
                case 3:
                    displayParkingLot();
                    break;
                case 4:
                    System.out.println("Exiting the car parking system.");
                    run = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
        
    }
}