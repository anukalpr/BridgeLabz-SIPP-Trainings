import java.util.Scanner;

public class ShortestLongestWord{

    public static String[] splitText(String text) {
        String[] words = new String[10];
        int index = 0;
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == ' ') {
                if (word.length() > 0) {
                    if (index == words.length) {
                        String[] temp = new String[words.length * 2];
                        for (int j = 0; j < words.length; j++) {
                            temp[j] = words[j];
                        }
                        words = temp;
                    }
                    words[index++] = word.toString();
                    word.setLength(0);
                }
            } else {
                word.append(c);
            }
        }
        if (word.length() > 0) {
            if (index == words.length) {
                String[] temp = new String[words.length * 2];
                for (int j = 0; j < words.length; j++) {
                    temp[j] = words[j];
                }
                words = temp;
            }
            words[index++] = word.toString();
        }

        String[] result = new String[index];
        for (int i = 0; i < index; i++) {
            result[i] = words[i];
        }
        return result;
    }

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

    public static String[][] getWordLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getStringLength(words[i]));
        }
        return result;
    }

    public static int[] findShortestAndLongest(String[][] wordLengths) {
        int shortestIndex = 0;
        int longestIndex = 0;
        for (int i = 1; i < wordLengths.length; i++) {
            int len = Integer.parseInt(wordLengths[i][1]);
            int shortestLen = Integer.parseInt(wordLengths[shortestIndex][1]);
            int longestLen = Integer.parseInt(wordLengths[longestIndex][1]);
            if (len < shortestLen) {
                shortestIndex = i;
            }
            if (len > longestLen) {
                longestIndex = i;
            }
        }
        return new int[]{shortestIndex, longestIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        String[] words = splitText(text);
        String[][] wordLengths = getWordLengths(words);
        int[] shortestLongest = findShortestAndLongest(wordLengths);

        System.out.println("Shortest word: " + wordLengths[shortestLongest[0]][0] +
                " (Length: " + wordLengths[shortestLongest[0]][1] + ")");
        System.out.println("Longest word: " + wordLengths[shortestLongest[1]][0] +
                " (Length: " + wordLengths[shortestLongest[1]][1] + ")");
        sc.close();
    }
}
