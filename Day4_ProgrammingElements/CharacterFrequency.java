import java.util.Scanner;

public class CharacterFrequency {

    public static char[] uniqueCharacters(String text) {
        int length = text.length();
        char[] temp = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount++] = current;
            }
        }

        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    public static String[][] charFrequency(String text) {
        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        char[] uniqueChars = uniqueCharacters(text);
        String[][] freqArray = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            freqArray[i][0] = String.valueOf(uniqueChars[i]);
            freqArray[i][1] = String.valueOf(frequency[uniqueChars[i]]);
        }

        return freqArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] result = charFrequency(text);

        System.out.println("Character frequencies:");
        for (String[] pair : result) {
            System.out.println(pair[0] + " = " + pair[1]);
        }

        sc.close();
    }
}
