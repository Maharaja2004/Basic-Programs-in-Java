package basicprograms;

import java.util.Scanner;

public class HarshadNumber {

	public static String harshad(int n) {
		
		int num=n;
		
		int res=0;
		while(num>0) {
			int rem=num%10;
			res=res+rem;
			num=num/10;
		}
		
		if(n%res==0) {
			return(n+" is a Harshad Number");
		}
		else {
			return(n+" is not a Harshad Number");
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the  Number:");
		int n=sc.nextInt();
        System.out.println(harshad(n));

	}

}
