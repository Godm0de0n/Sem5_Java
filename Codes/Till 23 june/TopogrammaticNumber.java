import java.util.*;

public class Main {
    public static boolean isTopo(int num) {
        String number = String.valueOf(num);
        int left = 0;
        int right = number.length() - 1;
        
        while (left <= right) {
            char leftChar = number.charAt(left);
            char rightChar = number.charAt(right);
            
            if (!isT(leftChar, rightChar)) {
                return false;
            }
            
            left++;
            right--;
        }
        
        return true;
    }
    
    private static boolean isT(char left, char right) {
        List<Character> validChars = Arrays.asList('0', '1', '8');
        
        return left == right || (left == '6' && right == '9') || (left == '9' && right == '6')
            && validChars.contains(left);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        if (isTopo(num)) {
            System.out.println(num + " is a topogrammatic number.");
        } else {
            System.out.println(num + " is not a topogrammatic number.");
        }
    }
}
