package basicprograms;
import java.util.Scanner;
public class Prime {

	public static String prime(int n) {
		boolean prime=true;
		if(n>=2) {
			if(n==2) {
				return "Prime";
			}
			else {
				for(int i=2;i<n;i++) {
					if(n%i==0) {
						prime=false;
						break;
					}
				}
			}
		}
		else {
			prime=false;
		}
		if(prime) {
			return "Prime Number";
		}
		else {
			return "Not a Prime Number";
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n=sc.nextInt();
		System.out.println(n+" is "+prime(n));
	}

}
