package basicprograms;

import java.util.Scanner;

public class StrongNumber {

	public static String strong(int n) {
		int num=n;int sum=0;
		while(n>0) {
			int rem=n%10;
			int fact=1;
			 for(int i=1;i<=rem;i++) {
				 fact=fact*i;
			 }
			 sum=sum+fact;
			 n=n/10;
		}
		if(num==sum) {
			return(num+" is a Strong Number");
		}
		else {
			return(num+" is not a Strong Number");
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the  Number:");
		int n=sc.nextInt();
		System.out.println(strong(n));
	}

}
