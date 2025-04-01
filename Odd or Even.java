package basicprograms;

import java.util.Scanner;

public class Odd_Even {
     
	public static void withoutmoduleo(int n) {
		if((n&1)==0) {
			System.out.println(n+" is Even Number");
		}
		else {
			System.out.println(n+" is Odd Number");
		}
	}
	
	public static String  usingmoduleo(int n) {
		if(n%2==0) {
			return "Even Number";
			}
		else {
			return "Odd Number";
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n=sc.nextInt();
	    System.out.println(n+" is "+usingmoduleo(n));
	    withoutmoduleo(22);
	}

}
