import java.util.Scanner;

public class SwapNibbles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        int swappedNumber = swapNibbles(number);
        System.out.println("Output:");
        System.out.println("21BCE11033");
        System.out.println("Abhisek Nag");
        System.out.println("After swapping the nibbles, The number is: " + swappedNumber);

        scanner.close();
    }

    public static int swapNibbles(int number) {
        int nibble1 = number & 0b1111000000000000;
        int nibble2 = number & 0b0000111100000000;
        int nibble3 = number & 0b0000000011110000;
        int nibble4 = number & 0b0000000000001111;


        int swappedNibble1 = nibble3 << 8;
        int swappedNibble3 = nibble1 >> 8;

        int swappedNibble2 = nibble4 << 8;
        int swappedNibble4 = nibble2 >> 8;

        int swappedNumber = (swappedNibble1 | swappedNibble2 | swappedNibble3 | swappedNibble4);

        return swappedNumber;
    }
}
