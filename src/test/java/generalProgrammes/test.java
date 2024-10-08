package generalProgrammes;

public class test {

	public static void main(String[] args) {
		System.out.println(isPrime(3));
	}

	private static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}