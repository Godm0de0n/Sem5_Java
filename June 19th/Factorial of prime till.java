import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int limit = scanner.nextInt();
        
        System.out.println("Factorials of prime numbers up to " + limit + ":");
        
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                long fact = calFact(i);
                System.out.println(i + "! = " + fact);
            }
        }
    }
    
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        
        return true;
    }
    
    private static long calFact(int number) {
        long fact = 1;
        
        for (int i = 2; i <= number; i++) {
            fact *= i;
        }
        
        return fact;
    }
}
