package basicprograms;

import java.util.Scanner;

public class Gcd {

	public static int gcd(int a,int b) {
		while(b>0) {
			int temp=b;
			b=a%b;
			a=temp;
		}
		return a;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the a value:");
		int a=sc.nextInt();
		System.out.print("Enter the b value:");
		int b=sc.nextInt();
		System.out.println("GCD of "+a+" and "+b+" is "+gcd(a,b));

	}

}
