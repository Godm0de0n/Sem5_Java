import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary string: ");
        String binaryString = scanner.nextLine();

        boolean isPalindrome = checkBinaryPalindrome(binaryString);

        if (isPalindrome) {
            System.out.println("The binary string is a palindrome.");
        } else {
            System.out.println("The binary string is not a palindrome.");
        }
    }

    public static boolean checkBinaryPalindrome(String binaryString) {
        int length = binaryString.length();

        for (int i = 0; i < length / 2; i++) {
            if (binaryString.charAt(i) != binaryString.charAt(length - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
