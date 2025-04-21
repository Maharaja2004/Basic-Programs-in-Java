package basicprograms;

import java.util.Scanner;

public class SumofDigits {

	public static int sumofdigits(int n) {
		int res=0;
		while(n>0) {
			int rem=n%10;
			res=res+rem;
			n=n/10;
		}
		return res;
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n=sc.nextInt();
		System.out.println("The sum of Digits in "+n+" is "+sumofdigits(n));

	}

}
