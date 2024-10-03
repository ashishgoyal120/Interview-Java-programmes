package generalProgrammes;

import java.util.Scanner;

public class P04_PalindromeWithoutStringBuffer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		isPalindrome(str);
		sc.close();
	}

	public static void isPalindrome(String str) {
		int length = str.length();
		String temp = "";

		for (int i = length - 1; i >= 0; i--) {
			temp = temp + str.charAt(i);
		}
		if (temp.equalsIgnoreCase(str)) { // to Ignore Case Sensitivity
			System.out.println("Palindrome");
		} else {
			System.out.println("not Palindrome");
		}
	}

}
