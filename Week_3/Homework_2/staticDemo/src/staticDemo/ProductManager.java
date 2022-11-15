package staticDemo;

public class ProductManager {
	public void add(Product product) {
		
		if(ProductValidator.isvalid(product)) {
			System.out.println("Ürün eklendi.");
		}
		else {
			System.out.println("Ürün bilgileri geçersizdir.");
		}
		
		ProductValidator productValidator = new ProductValidator();
		productValidator.bisey();
	}
}
