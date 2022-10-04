package interfacesNew;

public class Main {

	public static void main(String[] args) {
		//Interface'ler de abstract sınıflar gibi new'lenemez.
		CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
		
		customerManager.add();
		
		

	}

}
