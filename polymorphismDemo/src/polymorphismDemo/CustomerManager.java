package polymorphismDemo;

public class CustomerManager {
	
	private BaseLogger logger; //Değişken oluşturduk.
	
	public CustomerManager(BaseLogger logger) {  //Constructor ile müşteri ekleme işlemi yapılırken bana bir logger ver diyoruz.
		this.logger = logger;
	}
	
	public void add() {
		System.out.println("Musteri Eklendi.");
		this.logger.log(" LOGGED");
		
	}

}
