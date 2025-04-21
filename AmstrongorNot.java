package basicprograms;

import java.util.Scanner;

public class Amstrong {
       
	public static int count(int n) {
		int count=0;
		while(n>0) {
			count++;
			n=n/10;
		}
		return count;
	}
	
	public static String ams(int n,int count) {
		int add=0;int num=n;
		while(n>0) {
			int rem=n%10;
			  int result=1;
			  for(int i=1;i<=count;i++) {
				  result=result*rem;
			  }
			  add=add+result;
			  n=n/10;
		}
		if(add==num) {
			return " is Armstrong Number";
		}
		else {
			return " is not a Armstrong Number";
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n=sc.nextInt();
		int count=count(n);
        System.out.println(n+ams(n,count));
	}

}
