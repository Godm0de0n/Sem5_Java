import java.util.*;

public class Main
{
	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of elements in the array:");
    int p = scanner.nextInt();
        
    int[] arr = new int[p];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < p; i++) {
        arr[i] = scanner.nextInt();
    }
    Arrays.sort(arr);
	int left = 0;
	int right = p-1;
	System.out.println("Here is the output:");
	while(left<right){
	    System.out.println("("+ arr[left] + "," + arr[right]+ ")");
	    left++;
	    right--;
	}
	if (p%2!=0){
	    System.out.println("("+ 0 + "," + arr[right]+ ")");
	}
	}
}