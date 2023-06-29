public class Main
{
	public static void main(String[] args) {
    for(int j=2;j<18;j++){
	    if (j>1){
            int a=0;
            for (int i=2;i<j;i++){
                if (j%i==0){
                    a++;
                }
            }
            if (a<1){
                    System.out.println(j);
                }
        }
    }
	}
}


CPP REF

#include <iostream>

using namespace std;

int main()
{
    for(int j=2;j<18;j++){
        int a=0;
        for (int i=2;i<j;i++){
            if (j%i==0){
                a++;
            }
        }
        if (a<1){
                cout<<j<<endl;
            }
    }
    return 0;
}