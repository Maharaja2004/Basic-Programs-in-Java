package basicprograms;

import java.util.Scanner;

public class Palindrome {

	public static String palindrome(int n) {
		int res=0;int num=n;
		while(n>0) {
			int rem=n%10;
			res=res*10+rem;
			n=n/10;
		}
		if(res==num) {
			return " is Palindrome";
		}
		else {
			return " is Not a Palindrome";
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n=sc.nextInt();
		System.out.println(n+palindrome(n));
	}

}
