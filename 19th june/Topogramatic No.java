import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int a = 0;
        int b = t;
        List<Integer> ar = new ArrayList<>();
        
        while (t != 0) {
            ar.add(t % 10);
            t /= 10;
        }
        
        for (int i = 0; i < ar.size(); i++) {
            if (ar.get(i) == 9) {
                a = a * 10 + 6;
            }
            if (ar.get(i) == 6) {
                a = a * 10 + 9;
            }
            if (ar.get(i) == 1) {
                a = a * 10 + 1;
            }
            if (ar.get(i) == 0) {
                a = a * 10 + 0;
            }
            if (ar.get(i) == 8) {
                a = a * 10 + 8;
            }
        }
        
        if (b == a) {
            System.out.println("Its a T no");
        } else {
            System.out.println("Its not a T no");
        }
    }
}