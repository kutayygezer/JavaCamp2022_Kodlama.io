package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'i';

		switch (harf) {
		case 'a':
		case 'ı':
		case 'o':
		case 'u':
			System.out.println("Harf kalın");
			break;
		case 'e':
		case 'i':
		case 'ö':
		case 'ü':
			System.out.println("Harf sesli");
			break;
		default:
			System.out.println("Hatalı harf girişi");

		}

	}

}
