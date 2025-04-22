package basicprograms;

import java.util.Scanner;

public class Fibonacci {

	public static void fibonacci(int n) {
		int a=0;int b=1;
		while(n>0) {
			System.out.print(a+" ");
			int temp=a+b;
			a=b;
			b=temp;
			n--;
		}	
	}
	
	
	public static int[] fibon(int n) {
		int a=0;int b=1;
		int series[]=new int[n];
		
		 for(int i=0;i<n;i++) {
			 series[i]=a;
			 int temp=a+b;
			 a=b;
			 b=temp;
		 }
		 return series;
		}
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the  Number:");
		int n=sc.nextInt();
	  if(n>0) {
		 int result[]=fibon(n);
		 for(int nums:result) {
			 System.out.print(nums+" ");
		 }
	  }
	  else {
		  System.out.println("Enter Positive numberr:");
	  }
	}

}
