package basicprograms;

import java.util.Scanner;

public class NeonNumber {

	public static String neon(int n) {
		int sq=n*n;
		 
		int res=0;
		while(sq>0) {
			int rem=sq%10;
			res=res+rem;
			sq=sq/10;
		}
		
		if(res==n) {
			return(n+" is a Neon Number");
		}
		else {
			return(n+" is not a Neon Number");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the  Number:");
		int n=sc.nextInt();
		System.out.println(neon(n));
	}

}
