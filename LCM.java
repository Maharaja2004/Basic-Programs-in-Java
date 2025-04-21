package basicprograms;

import java.util.Scanner;

public class Lcm {
    
	
	public static int gcd(int a,int b) {
		while(b>0) {
			int temp=b;
			b=a%b;
			a=temp;
		}
		return a;
	}
	
	public static int lcm(int x,int y,int gcd) {
		int lcm=(x*y)/gcd;
		return lcm;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the a value:");
		int a=sc.nextInt();
		System.out.print("Enter the b value:");
		int b=sc.nextInt();
		int gcd=gcd(a,b);
		int x=a;int y=b;
		System.out.print("LCM of "+a+" and "+b+" is "+lcm(x,y,gcd));
	}

}
