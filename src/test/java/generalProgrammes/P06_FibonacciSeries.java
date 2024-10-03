package generalProgrammes;

import java.util.Scanner;

/*
    Fibonacci Sequence = 0, 1, 1, 2, 3, 5, 8, 13, 21
 */

public class P06_FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number upto print fibonnaci series :");
		int number = sc.nextInt();

		if (number <= 0) {
			System.out.println("Please enter a positive number.");
		} else {
			getFibonacciSeries(number);
		}
		sc.close();
	}

	private static void getFibonacciSeries(int number) {
		int num1 = 0;
		int num2 = 1, num3;
		for (int i = 1; i <= number; i++) {
			num3 = num1 + num2;
			System.out.print(" " + num1 + " ");
			num1 = num2;
			num2 = num3;
		}
	}

}
