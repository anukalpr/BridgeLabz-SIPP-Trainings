package day5_ProgrammingElements;

import java.util.Scanner;

public class NumberSignChecker {

    public static int getSign(int num) {
        if (num < 0) {
            return -1;
        } else if (num > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();
        int sign = getSign(number);
        String result;

        if (sign == -1) {
            result = "Negative number";
        } else if (sign == 1) {
            result = "Positive number";
        } else {
            result = "Zero";
        }

        System.out.println("The entered number is: " + result);
        scanner.close();
    }
}

