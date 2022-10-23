package arkadasSayilar;

public class Main {

	public static void main(String[] args) {
		// 220-284
		int num1 = 220;
		int sum1 = 0;
		int num2 = 284;
		int sum2 = 0;

		for (int i = 1; i < num1; i++) {
			if (num1 % i == 0) {
				sum1 = sum1 + i;
			}
		}
		for (int i = 1; i < num2; i++) {
			if (num2 % i == 0) {
				sum2 = sum2 + i;
			}
		}
		if(sum1 == num2 && sum2 == num1) {
			System.out.println("Arkadaş sayı");
		}
		else {
			System.out.println("Arkadaş sayı değil");

		}

	}

}
