package basicprograms;

public class PascalTraingle {
  public static void main(String args[]) {
	  int n=5;
	  int k=1;
	  int value=k;
	  for(int i=1;i<=n;i++) {
		  for(int j=n;j>i;j--) {
			  System.out.print(" ");
		  }
		  k=value;
		  while(k>0) {
			  int rem=k%10;
			  System.out.print(rem+" ");
			  k=k/10;
		  }
		  value=value*11;
		  System.out.println()	;
		  }
  }
}
