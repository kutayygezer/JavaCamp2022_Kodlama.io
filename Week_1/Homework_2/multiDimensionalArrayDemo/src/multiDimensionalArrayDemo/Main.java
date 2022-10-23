package multiDimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {

		String[][] sehirler = new String[3][3];

		sehirler[0][0] = "London";
		sehirler[0][1] = "New York";
		sehirler[0][2] = "Istanbul";
		sehirler[1][0] = "Berlin";
		sehirler[1][1] = "Tokyo";
		sehirler[1][2] = "Sydney";
		sehirler[2][0] = "Konya";
		sehirler[2][1] = "Ankara";
		sehirler[2][2] = "Los Angeles";

		for (int i = 0; i <= 2; i++) {
			System.out.println("------------");
			for (int j = 0; j <= 2; j++) {
				System.out.println(sehirler[i][j]);
			}
		}

	}

}
