Algorithm to find GCD of 2 number


import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the first no: ");
		int a = sc.nextInt();
		System.out.print("Enter the second no: ");
		int b = sc.nextInt();
		int q1 = Math.max(a,b);
		int q2 = Math.min(a,b);
		while(q2!=0){
		    int rem = q1 %q2;
		    q1=q2;
		    q2 = rem;
		}
		System.out.println("GCD of "+a+" and " + b+ " is: "+q1);
	}
}