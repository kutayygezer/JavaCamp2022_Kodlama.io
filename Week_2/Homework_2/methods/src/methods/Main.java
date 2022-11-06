package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
	}

	// camel casing
	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int arananSayi = 9;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == arananSayi) {
				varMi = true;
				break;
			}
		}
		if (varMi) {
			mesajVer("Sayı mevcuttur: " + arananSayi);
		} else {
			mesajVer("Sayı mevcuttur değildir: " + arananSayi);
		}

	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}
