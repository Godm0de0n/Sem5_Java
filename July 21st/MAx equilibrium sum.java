import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        System.out.print("Enter the number of elements: ");
        n = scanner.nextInt();

        int[] a = new int[n];
        int sum = 0;

        System.out.print("Enter the elements: ");
        for (int t = 0; t < n; t++) {
            int z = scanner.nextInt();
            a[t] = z;
            sum += z;
        }

        int lsum = 0;
        for (int i = 0; i < n; i++) {
            int rsum = sum - lsum - a[i];

            if (lsum == rsum) {
                System.out.println("Equilibrium index is: " + i);
                System.out.println("Max Equilibrium sum: " + lsum);
                return;
            }

            lsum += a[i];
        }

        System.out.println("-1");
    }
}

