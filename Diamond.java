package basicprograms;

public class Diamond {

	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n;i++) {
			System.out.print(" ");
			for(int s=1;s<=n-i;s++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
   
		
		for(int i=n-1;i>=1;i--) {
			System.out.print(" ");
			for(int s=1;s<=n-i;s++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
