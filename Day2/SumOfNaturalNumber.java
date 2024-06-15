package Day2;
import java.util.Scanner;
public class SumOfNaturalNumber {
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int n = scanner.nextInt();

	        System.out.println("Sum using for loop: " + sumForLoop(n));
	        System.out.println("Sum using while loop: " + sumWhileLoop(n));        
	        scanner.close();
	    }


	public static int sumForLoop(int n) {
	        int sum = 0;
	        for (int i = 1; i <= n; sum += i, i++);
	        return sum;
	    }

	public static int sumWhileLoop(int n) {
	        int sum = 0;
	        int i = 1;
	        while (i <= n) {
	            sum += i;
	            i++;
	        }
	        return sum;
	    }

	   
	}


