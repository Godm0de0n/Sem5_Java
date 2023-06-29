import java.util.*;

public class Main
{
	int arr[];
	public static List<int[]> findNumberPairs(int[] array, int difference) {
        List<int[]> pairs = new ArrayList<>();
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int num : array) {
            int complement = num - difference;
            if (numMap.containsKey(complement)) {
                int[] pair = {num, complement};
                pairs.add(pair);
            }
            numMap.put(num, num);
        }

        return pairs;
    }
    
	void sieve(int n,int m)
	{
		boolean prime[] = new boolean[n+1];
		for(int i=0;i<=n;i++)
			prime[i] = true;
		
		for(int p = 2; p*p <=n; p++)
		{
			if(prime[p] == true)
			{
				for(int i = p*p; i <= n; i += p)
					prime[i] = false;
			}
		}
		
		for(int i = m; i <= n; i++)
		{
			if(prime[i] == true)
				arr.add(prime(i));
		}
		
		List<int[]> pairs = findNumberPairs(arr, 6);
        
        for (int[] pair : pairs) {
            System.out.println(pair[0] + " - " + pair[1]);
	}
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter The Lower-Bound:");
	    int m= sc.nextInt();
	    System.out.print("Enter The Lower-Bound:");
	    int n= sc.nextInt();
		System.out.println("Following are the prime numbers ");
		Main g = new Main();
		g.sieve(n,m);
	}
}