package basicprograms;

import java.util.Scanner;

public class SumofNatural {

	public static int sum(int n) {
		int sum=(n*(n+1))/2;
		return sum;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the  Number:");
		int n=sc.nextInt();
		System.out.println(sum(n));

	}

}
