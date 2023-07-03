import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int p = scanner.nextInt();
        
        int[] arr = new int[p];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < p; i++) {
            arr[i] = scanner.nextInt();
        }
        int n= arr.length-1;
        int m=arr[n];
        System.out.println("Leaders of this array: ");
        while(n!=0){
            if (arr[n]>=m){
                System.out.println(arr[n]);
                m=arr[n];
            }
            n--;
        }
	}
}
