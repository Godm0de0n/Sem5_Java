import java.util.Scanner;

public class LexicographicallyFirstPalindromicString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the input string: ");
        String input = scanner.nextLine().toUpperCase();

        String p = findLex(input);
        System.out.println("Output:");
        System.out.println("21BCE11033");
        System.out.println("Abhisek Nag");
        System.out.println(p);

        scanner.close();
    }

    public static String findLex(String input) {
        int[] charFrequency = new int[26];
        StringBuilder p = new StringBuilder();

        for (char ch : input.toCharArray()) {
            charFrequency[ch - 'A']++;
        }

        char singleCharacter = '\0';
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            if (charFrequency[ch - 'A'] % 2 != 0) {
                if (singleCharacter != '\0') {
                    return "Invalid input, cannot form a palindromic string.";
                }
                singleCharacter = ch;
                charFrequency[ch - 'A']--;
            }

            while (charFrequency[ch - 'A'] > 0) {
                p.append(ch);
                charFrequency[ch - 'A'] -= 2;
            }
        }

        StringBuilder secondHalf = new StringBuilder(p).reverse();
        if (singleCharacter != '\0') {
            p.append(singleCharacter);
        }
        p.append(secondHalf);

        return p.toString();
    }
}
