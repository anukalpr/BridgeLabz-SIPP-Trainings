import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram{

    public static boolean isAnagram(String text1, String text2) {
        if (text1.length() != text2.length()) {
            return false;
        }

        Map<Character, Integer> freqMap = new HashMap<>();

        for (char c : text1.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        for (char c : text2.toCharArray()) {
            if (!freqMap.containsKey(c)) {
                return false;
            }
            freqMap.put(c, freqMap.get(c) - 1);
            if (freqMap.get(c) == 0) {
                freqMap.remove(c);
            }
        }

        return freqMap.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first text: ");
        String text1 = sc.nextLine();

        System.out.print("Enter second text: ");
        String text2 = sc.nextLine();

        if (isAnagram(text1, text2)) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }

        sc.close();
    }
}
