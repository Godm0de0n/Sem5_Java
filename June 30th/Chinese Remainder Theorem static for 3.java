import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a1:");
	    int a1= sc.nextInt();
	    System.out.println("Enter m1:");
	    int m1= sc.nextInt();
	    System.out.println("Enter a2:");
	    int a2= sc.nextInt();
	    System.out.println("Enter m2:");
	    int m2= sc.nextInt();
	    System.out.println("Enter a3:");
	    int a3= sc.nextInt();
	    System.out.println("Enter m3:");
	    int m3= sc.nextInt();
	    int M = m1 * m2 * m3;
	    System.out.println("-------");
	    int b1 = M/m1;
	    int b2 = M/m2;
	    int b3 = M/m3;
	    int B1=1;
	    int B2=1;
	    int B3=1;
	    while((b1*B1) % m1 !=1){
	        B1++;
	    }
	    while((b2*B2) % m2 !=1){
	        B2++;
	    }
	    while((b3*B3) % m3 !=1){
	        B3++;
	    }
	    int x= (a1*b1*B1 + a2*b2*B2 + a3*b3*B3) % M;
	    System.out.println("The answer is : " + x);
	}
}
