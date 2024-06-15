package Day2;

public class Exercises {
	public static void main(String[] args) {
		System.out.println("(a + c)");
		int n = 5;
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
			
		}
		int m=6;
		 for (int i = m - 1; i > 0; i--) {
	            for (int j = 0; j < i; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
		System.out.println();
		System.out.println("(b)");

		int rows = 7; 
		for (int i = 1; i <= rows; i++) {

			for (int j = i; j < rows; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
