import java.util.*;

public class Minimum_sum_of_the_hour_glass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of Columns: ");
        int c = sc.nextInt();
        int[][] a = new int[r][c];
        for (int i = 0; i < r; i++) {
            System.out.println("Enter the elements of row " + (i + 1) + ": ");
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < r - 2; i++) {
            for (int j = 0; j < c - 2; j++) {
                int sum = a[i][j] + a[i][j + 1] + a[i][j + 2]
                        + a[i + 1][j + 1]
                        + a[i + 2][j] + a[i + 2][j + 1] + a[i + 2][j + 2];
                minSum = Math.min(minSum, sum);
            }
        }
        System.out.println("21BCE11033");
        System.out.println("Abhisek Nag");
        System.out.println("Min sum of the hour glass in the array is: " + minSum);
    }
}
