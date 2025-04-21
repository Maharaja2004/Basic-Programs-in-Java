package basicprograms;

import java.util.Scanner;

public class NumberofDigits {
 
	public static int countofdigits(int n) {
		int count=0;
		while(n>0) {
			count++;
			n=n/10;
		}
		return count;
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n=sc.nextInt();
		System.out.println("Number of  Digits in "+n+" is "+countofdigits(n));

	}

}
