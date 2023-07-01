import java.util.Scanner;

public class ChineseRemainderTheorem {
    
    public static long chineseRem(long[] num, long[] rem) {
        if (num.length != rem.length) {
            throw new IllegalArgumentException("The number of elements in num and rem should be the same.");
        }
        
        long product = 1;
        for (long n : num) {
            product *= n;
        }
        
        long result = 0;
        for (int i = 0; i < num.length; i++) {
            long pp = product / num[i];
            result += rem[i] * modInverse(pp, num[i]) * pp;
        }
        
        return result % product;
    }
    
    private static long modInverse(long a, long m) {
        long m0 = m;
        long y = 0, x = 1;
        
        if (m == 1) {
            return 0;
        }
        
        while (a > 1) {
            long q = a / m;
            long t = m;
            
            m = a % m;
            a = t;
            t = y;
            
            y = x - q * y;
            x = t;
        }
        
        if (x < 0) {
            x += m0;
        }
        
        return x;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of congruences: ");
        int n = scanner.nextInt();
        
        long[] num = new long[n];
        long[] rem = new long[n];
        
        System.out.println("Enter the divisors and remainders:");
        for (int i = 0; i < n; i++) {
            System.out.print("Divisor " + (i + 1) + ": ");
            num[i] = scanner.nextLong();
            
            System.out.print("Remainder " + (i + 1) + ": ");
            rem[i] = scanner.nextLong();
        }

        System.out.println("-------");
        
        long result = chineseRem(num, rem);
        System.out.println("The solution to the congruences is: " + result);
        
        scanner.close();
    }
}
