import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary string: ");
        String binaryString = scanner.nextLine();

        System.out.println("Original binary string: " + binaryString);

        String toggledString = toggleBinaryString(binaryString);

        System.out.println("Toggled binary string: " + toggledString);
    }

    public static String toggleBinaryString(String binaryString) {
        StringBuilder toggledString = new StringBuilder();

        for (int i = 0; i < binaryString.length(); i++) {
            char c = binaryString.charAt(i);

            if (c == '0') {
                toggledString.append('1');
            } else if (c == '1') {
                toggledString.append('0');
            } else {
            }
        }

        return toggledString.toString();
    }
}
