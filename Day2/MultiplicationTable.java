package Day2;

import java.util.Scanner;

public class MultiplicationTable {
	public static void printMultiplicationTable(int n) {
		for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.println(i + "x" + j + "=" + (i * j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
  
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        System.out.println("Multiplication Table: ");
        printMultiplicationTable(n);   
        scanner.close();
        
    }
        

}
