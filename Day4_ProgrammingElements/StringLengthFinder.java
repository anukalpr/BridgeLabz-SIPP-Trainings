import java.util.Scanner;

public class StringLengthFinder {
    public static int getStringLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();
        int manualLength = getStringLength(input);
        int builtInLength = input.length();
        System.out.println("Manual length: " + manualLength);
        System.out.println("Built-in length: " + builtInLength);
        sc.close();
    }
}
