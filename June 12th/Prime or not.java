import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int t= sc.nextInt();
	    if (t>1){
            int a=0;
            for (int i=2;i<t;i++){
                if (t%i==0){
                    a++;
                }
            }
            if (a>0){
                    System.out.println("its not prime");
                }
            else{
                System.out.println("its prime");
            }
        }
        else{
            System.out.println("its not prime");
        }
	}
}


cpp FOR REF

#include <iostream>

using namespace std;

int main()
{
    int t;
    cin>>t;
    if (t>1){
        int a=0;
        for (int i=2;i<t;i++){
            if (t%i==0){
                a++;
            }
        }
        if (a>0){
                cout<<"its not prime";
            }
        else{
            cout<<"its prime";
        }
    }
    else{
        cout<<"its not prime";
    }
}
