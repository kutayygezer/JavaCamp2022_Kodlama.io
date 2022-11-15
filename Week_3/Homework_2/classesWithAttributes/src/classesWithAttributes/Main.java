package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product(1, "Laptop", "Dell Laptop", 15000, 9, "Siyah");
		
		
//		Product product = new Product();
//		product.setName("Laptop");
//		product.setId(1);
//		product.setDescription("Dell Laptop");
//		product.setPrice(15000);
//		product.setStockAmount(12);
//		product.setRenk("siyah");
//		product.getKod();
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);

		System.out.println(product.getKod());
	}

}
