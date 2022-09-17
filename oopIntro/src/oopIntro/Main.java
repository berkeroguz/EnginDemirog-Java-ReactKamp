package oopIntro;

import java.security.PublicKey;

public class Main {

	public static void main(String[] args) {
		
		//HepsiBurada Deneme
		
		 Product product1 = new Product(1,"Lenovo V15",15000,"16GB Ram PC",10); // Referans oluşturma intance
		

		 Product product2 = new Product(); // Referans oluşturma intance
		 product2.setId(2);
		 product2.setName("Lenovo V15");
		 product2.setDetail("16 GB Ram");
		 product2.setDiscount(10);
		 product2.setUnitPrice(16000);
		 
		 System.out.println(product2.getUnitPriceAfterDiscount());
		 
		
		 
		 Product product3 = new Product(); // Referans oluşturma intance
		
		
		Product [] products = {product1,product2,product3};  //'Product' türünde products diye bir dizi oluşturup için ürünleri yazdık.
		
		for (Product product : products) //tüm diziyi gezer.
		{
			System.out.println("");
		}
		
		
		System.out.println(products.length);
		
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("İçecek");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Yiyecek");
		
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product1);
		productManager.addToCart(product1);
		
		

	}

}
