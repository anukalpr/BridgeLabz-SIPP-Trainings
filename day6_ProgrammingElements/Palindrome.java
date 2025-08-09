package day6_ProgrammingElements;

public class Palindrome {
    private String text;

    public Palindrome(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        String cleaned = text.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        Palindrome checker1 = new Palindrome("madam");
        Palindrome checker2 = new Palindrome("Hello World");
        checker1.displayResult();
        checker2.displayResult();
    }
}
