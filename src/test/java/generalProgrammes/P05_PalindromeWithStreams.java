package generalProgrammes;

import java.util.Scanner;
import java.util.stream.IntStream;

public class P05_PalindromeWithStreams {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to check palindrome or Not :");
		String str = sc.nextLine();
		System.out.println(str + " is " + (isPalindrome(str) ? "" : "not ") + "a palindrome.");
		sc.close();
	}

	public static boolean isPalindrome(String str) {
		String cleanedStr = str.replaceAll("\\s+", "").toLowerCase(); // Clean the string (remove spaces, case
																		// insensitive)
		return IntStream.range(0, cleanedStr.length() / 2)
				.allMatch(i -> cleanedStr.charAt(i) == cleanedStr.charAt(cleanedStr.length() - i - 1));
	}

}
