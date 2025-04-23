package basicprograms;

import java.util.Scanner;

public class LargestDigit {

	public static int largest(int n) {
		int max=0;
		while(n>0) {
			int rem=n%10;
			 if(max<rem) {
				 max=rem;
			 }
			 n=n/10;
		}
		return max;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the  Number:");
		int n=sc.nextInt();
		System.out.println("The Largest Digit in "+n+" is "+largest(n));

	}

}
