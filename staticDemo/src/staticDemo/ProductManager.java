package staticDemo;

public class ProductManager {
	public void add(Product product) {
		
		
		if (ProductValidator.isValid(product)) // == true yazmadan da olur
		{
			System.out.println("Eklendi" + product.name);
			
		}
		else
		{
			System.out.println("Ürün bilgileri hatalı");
		}
		
	
	}

}
