import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] v = {2,1,7,4};
		int target = sc.nextInt();;
        for(int i = 0; i < v.length; i++){
            if(target == v[i]){
                System.out.println(i);
            }
        }
	}
}