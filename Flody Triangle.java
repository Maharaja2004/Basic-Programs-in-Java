package basicprograms;

public class FlodyTriangle {

	public static void main(String[] args) {
		int n=4;
		int k=0;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(++k+" ");
			}
			System.out.println();
		}

	}

}
