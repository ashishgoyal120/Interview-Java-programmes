package generalProgrammes;

public class P10_SumOf_N_Numbers {

	public static void main(String[] args) {
		int sum = 0;
		int sumUptoNumbers = 10;
		for (int i = 0; i <= sumUptoNumbers; i++) {
			sum = sum + i;
		}
		System.out.print("The Sum of first " + sumUptoNumbers + " numbers is : " + sum);
	}

}
