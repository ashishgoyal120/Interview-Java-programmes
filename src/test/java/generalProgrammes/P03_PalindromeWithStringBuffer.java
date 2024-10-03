package generalProgrammes;

import java.util.Scanner;

public class P03_PalindromeWithStringBuffer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to check palindrome or Not :");
		String s = sc.nextLine();
		IsPalindrome(s);
		sc.close();
	}

	public static void IsPalindrome(String s) {
		StringBuffer sb = new StringBuffer(s);
		StringBuffer rev = sb.reverse();
		String reverse = rev.toString();

		if (reverse.equalsIgnoreCase(s)) {     // to ignore case sensitivity
			System.out.println("Entered String is palindrome...!");
		} else {
			System.out.println("Entered String is not a Palindrome...!");
		}
	}

}
