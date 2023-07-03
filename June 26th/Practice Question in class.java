no of elements with odd factors in given range;
find the possible pallindrom in a given string;


import java.lang.Math;
import java.util.Scanner;

public class Main {
    public static int countE(int start, int end) {
        int c = 0;
        for (int num = start; num <= end; num++) {
            if (Math.sqrt(num) % 1 == 0) {
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int c = countE(start, end);
        System.out.println("Number of elements with odd factors: " + c);
    }
}




import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Starting number: ");
        int start = scanner.nextInt();
        System.out.println("Ending number: ");
        int end = scanner.nextInt();
        int a=0;
        
        for (int i=start; i<end;i++){
            if (i%2!=0){
                a++;
            }
        }
        System.out.println("Number of elements with odd factors: " + a);
	}
}




import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<String> find(String s) {
        List<String> palindromes = new ArrayList<>();
        int length = s.length();

        for (int i = 0; i < length; i++) {
            exp(s, i, i, palindromes);
            exp(s, i, i + 1, palindromes);
        }

        return palindromes;
    }

    private static void exp(String s, int left, int right, List<String> palindromes) {
        int length = s.length();

        while (left >= 0 && right < length && s.charAt(left) == s.charAt(right)) {
            palindromes.add(s.substring(left, right + 1));
            left--;
            right++;
        }
    }

    public static void main(String[] args) {
        String input = "madam arora teaches malayalam";
        List<String> palindromes = find(input);
        
        System.out.println("Palindromes found:");
        for (String palindrome : palindromes) {
            System.out.println(palindrome);
        }
    }
}
