import java.util.*;

public class Main
{
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
				System.out.print(i + " ");
		}
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
