package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int arananSayi = 9;

		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i] == arananSayi) {
				System.out.println("Aranan sayı var");
				return;
			}
		}
		System.out.println("Aranan sayı yok");

	}

}
