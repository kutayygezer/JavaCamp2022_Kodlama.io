package arraysDemo;

public class Main {

	public static void main(String[] args) {

		String[] haftanınGünleri = new String[7];
		haftanınGünleri[0] = "Pazartesi";
		haftanınGünleri[1] = "Salı";
		haftanınGünleri[2] = "Çarşamba";
		haftanınGünleri[3] = "Perşembe";
		haftanınGünleri[4] = "Cuma";
		haftanınGünleri[5] = "Cumartesi";
		haftanınGünleri[6] = "Pazar";

		System.out.println("Haftanın Günleri:\n");

		for (int i = 0; i < haftanınGünleri.length; i++) {

			System.out.println(haftanınGünleri[i]);
		}
		System.out.println("\n-------------------------\n");
		
		for(String günler:haftanınGünleri) {
			System.out.println(günler);
		}

	}

}
