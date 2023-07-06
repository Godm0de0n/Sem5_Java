1 byte = 8 bits
1 nibble = 4 bits

input  = 1010 1011
output = 1011 1010

import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int N = sc.nextInt();
    int right = (N & 0b00001111);

	right= (right<<4);

	int left = (N & 0b11110000);

	left = (left>>4);

    System.out.println ("After swapping the nibbles: " + (right | left));
  }
}
