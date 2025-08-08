import java.util.Scanner;

public class CustomTrim {

    public static int[] findTrimIndexes(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    public static String customSubstring(String text, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text with leading/trailing spaces: ");
        String text = sc.nextLine();

        int[] indexes = findTrimIndexes(text);
        String trimmedCustom = customSubstring(text, indexes[0], indexes[1]);
        String trimmedBuiltIn = text.trim();

        System.out.println("Custom trimmed text: '" + trimmedCustom + "'");
        System.out.println("Built-in trimmed text: '" + trimmedBuiltIn + "'");
        System.out.println("Are both equal? " + compareStrings(trimmedCustom, trimmedBuiltIn));

        sc.close();
    }
}
