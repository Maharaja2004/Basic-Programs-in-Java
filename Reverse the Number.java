package basicprograms;

import java.util.Scanner;

public class Reverse {

	public static int reverse(int n) {
		int res=0;
		while(n>0) {
			int rem=n%10;
			res=res*10+rem;
			n=n/10;
		}
		return res;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n=sc.nextInt();
		System.out.println("The Reversed Number of "+n+" is "+reverse(n));
	}

}
