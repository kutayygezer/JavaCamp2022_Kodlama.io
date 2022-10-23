
public class Main {

	public static void main(String[] args) {
		
		int a = 60;
		int b = 100;
		int c = 27;
		
		if (a > b && a > c) {
			System.out.println("En büyük sayı: " + a);
		} 
		else if(b > a && b > c) {
			System.out.println("En büyük sayı: " + b);
		}
		else {
			System.out.println("En büyük sayı: " + c);
		}
		
	}

}
