package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String metin = "Hava çok soğuk!";
		System.out.println(metin);
		System.out.println("-----------------------");
		System.out.println("Metnin eleman sayısı: " + metin.length());
		System.out.println("Metnin 10. elemanı: " + metin.charAt(9));
		System.out.println("-----------------------");
		System.out.println(metin.concat(" Sad moment..."));
		String metin2 = metin.concat(" Sad moment...");
		System.out.println(metin2);
		System.out.println("-----------------------");
		System.out.println(metin.startsWith("H"));
		System.out.println(metin.endsWith("k"));
		System.out.println("-----------------------");
		char[] karakterler = new char[4];
		metin.getChars(0, 4, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(metin.indexOf("ok"));
		System.out.println(metin.lastIndexOf('o'));
		System.out.println("-----------------------");
		System.out.println(metin.replace(' ', '-'));
		System.out.println("-----------------------");
		System.out.println(metin.substring(2, 8));
		System.out.println("-----------------------");

		for (String kelime : metin.split(" ")) {

			System.out.println(kelime);
		}
		System.out.println("-----------------------");
		System.out.println(metin.toLowerCase());
		System.out.println(metin.toUpperCase());
		System.out.println("-----------------------");

		String metin3 = "    Lovely Weather!    ";
		System.out.println(metin3);
		System.out.println(metin3.trim());

	}

}
