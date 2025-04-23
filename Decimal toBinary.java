package basicprograms;

import java.util.Scanner;

public class DecimaltoBinary {

	public static String binary(int n) {
		String s="";
		if(n==0) {
			s=s+'0';
		}
		while(n>0) {
			int rem=n%2;
			s=(char)('0'+rem)+s;
			n=n/2;
		}
		return s;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the  Number:");
		int n=sc.nextInt();
		System.out.println(binary(n));

	}

}
