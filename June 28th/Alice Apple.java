import java.util.*;
public class Main
{
	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of trees in North:");
    int n = scanner.nextInt();
    System.out.println("Enter the number of trees in South:");
    int s = scanner.nextInt();
    System.out.println("Enter the number of trees in East:");
    int e = scanner.nextInt();
    System.out.println("Enter the number of trees in West:");
    int w = scanner.nextInt();
    System.out.println("Enter the number of apples given by single tree:");
    int k = scanner.nextInt();
    System.out.println("Enter the number of green apple ordered:");
    int a = scanner.nextInt();
    System.out.println("Enter the number of red apple ordered:");
    int b = scanner.nextInt();
    
    System.out.println("------------------------------------");
    
    
    if ((k*n+w+e >= a) || (k*s+w+e >=b)){
        if (k*n+w+e >= a){
            System.out.println("Order for green apple Satisfied");
        }
        else {
            System.out.println("Order for green apple NOT Satisfied");
        }
        if (k*s+w+e >=b){
            System.out.println("Order for red apple Satisfied");
        }
        else {
            System.out.println("Order for red apple NOT Satisfied");
        }
    }
    else{
        System.out.println("Order Not Satisfied");
    }
	}
}
