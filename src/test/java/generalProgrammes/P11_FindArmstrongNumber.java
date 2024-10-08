package generalProgrammes;

public class P11_FindArmstrongNumber {

	public static void main(String[] args) {
		isArmstrongNumber(153); // Yes
		isArmstrongNumber(370); // Yes
		isArmstrongNumber(455); // NO
	}

	private static void isArmstrongNumber(int num) {
		int cube = 0;
		int reminder;
		int temp = num;

		while (num > 0) {
			reminder = num % 10;
			num = num / 10;
			cube = cube + (reminder * reminder * reminder);
		}
		if (temp == cube) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not Armstrong Number");
		}
	}

}
