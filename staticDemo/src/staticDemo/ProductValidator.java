package staticDemo;

public class ProductValidator {
	
	static {
		System.out.println("Static kod çalıştı / Constructor gibi");
	}
	
	public static boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) { //! koyarsan eşit değilse demek
			return true;
		}
		else {
			return false;
		}
		
		
	}
	
	public void bisey() {
		
	}
	public static class BaskaBirClass {
		public static void sil() {
			//Inner class denir. Class içinde class oluşturulup başına static koyunca hepsi static olailbir. Gruplandırma amaçlı kullanılır.
		}
	}
	
	

}
