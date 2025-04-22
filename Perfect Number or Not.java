package basicprograms;

import java.util.Scanner;

public class PerfectNumber {

	public static String perfect(int n) {
		int sum=0;int num=n;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(sum==num) {
			return " is Perfect Number";
		}
		else {
			return " is not a Perfect Number";
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the  Number:");
		int n=sc.nextInt();
        System.out.print(n+perfect(n));
	}

}
