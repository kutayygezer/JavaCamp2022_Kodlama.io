package loopDemo;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("1 den 10 a kadar olan sayma sayıları:");
		
		//For
		for(int i = 1; i<=10; i++) {
			
			System.out.println(i);
			
		}
		
		System.out.println("For döngüsü finish");
		
		int i = 1;
		System.out.println("İlk 5 sayı:");
		//while
		while(i>=1 && i<=5) {
			
			System.out.println(i);
			i++;
		}
		System.out.println("While döngüsü finish");
		
		int j = 5;
		//Do-While
		do {
			System.out.println(j);
			j+=5;
		}while(j<26);
		System.out.println("Do-While döngüsü finish");

	}

}
