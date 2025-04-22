package basicprograms;

import java.util.Scanner;

public class Automorphic {
	
		
	public static String automorphic(int n) {
		int sq=n*n;
		int num=n;
		int count=0;
		while(num>0) {
			count++;
			num=num/10;
	    }
		
		int div=1;
		for(int i=0;i<count;i++) {
			div=div*10;
		}
		int lastdigit=sq%div;
		

		if(lastdigit==n) {
			return(n+" is a Automorphic Number");
		}
		else {
			return(n+" is not a Automorphic Number");
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the  Number:");
		int n=sc.nextInt();
        System.out.println(automorphic(n));
	}

}
