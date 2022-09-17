package staticDemo;

public class Main {

	public static void main(String[] args) { //Staticler ramde çok yer kaplar.
		ProductManager manager = new ProductManager();
		Product product = new Product();
		product.id = 1;
		product.name = "Elbise";
		product.price = 1500;
		manager.add(product);
		

	}

}
