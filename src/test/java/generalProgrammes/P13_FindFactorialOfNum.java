package generalProgrammes;

public class P13_FindFactorialOfNum {

	// 1. Without Recursive -- Use for Loop
	public static void main(String[] args) {
		System.out.println(getFactorial(4));
		System.out.println(getFactorialrecursive(4));
	}

	public static int getFactorial(int num) {
		int fact = 1; // Dont Use 0 otherwise output will be always 0
		if (num == 0) {
			return 1;
		}

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}

	// 2. With Recursive - Means Same function calling Itself.
	public static int getFactorialrecursive(int num) {
		if (num == 0) {
			return 1;
		} else {
			return (num * getFactorialrecursive(num - 1));
		}
	}
}