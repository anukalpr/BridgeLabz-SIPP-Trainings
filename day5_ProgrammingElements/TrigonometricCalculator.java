package day5_ProgrammingElements;

import java.util.Scanner;

public class TrigonometricCalculator {

    public static double[] calculateTrigonometricFunctions(double angleDegrees) {
        double angleRadians = Math.toRadians(angleDegrees);

        double sine = Math.sin(angleRadians);
        double cosine = Math.cos(angleRadians);
        double tangent = Math.tan(angleRadians);

        return new double[] {sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        double[] results = calculateTrigonometricFunctions(angle);

        System.out.println("Sine(" + angle + "°) = " + results[0]);
        System.out.println("Cosine(" + angle + "°) = " + results[1]);
        System.out.println("Tangent(" + angle + "°) = " + results[2]);

        sc.close();
    }
}

