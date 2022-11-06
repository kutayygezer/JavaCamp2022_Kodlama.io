package classes;

public class Main {

	public static void main(String[] args) {
		//reference type
		CustomerManager customerManager = new CustomerManager();//101
		CustomerManager customerManager2 = new CustomerManager();//102
		customerManager = customerManager2;//Both are 102 now, 101 -> garbage collector 
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		//value
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2);
		
		//reference
		int[] sayilar1 = new int[] {1,2,3};//101
		int[] sayilar2 = new int[] {4,5,6};//102
		sayilar2 = sayilar1;//Both are 101 now, 102 -> garbage collector
		sayilar1[0] = 10;//10,2,3
		System.out.println(sayilar2[0]);
	}

}
