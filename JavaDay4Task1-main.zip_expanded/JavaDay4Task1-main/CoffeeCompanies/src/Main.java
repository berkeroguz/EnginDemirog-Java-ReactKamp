import Abstracts.BaseCustomerManager;
import Adaptors.MernisServiceAdapter;
import Concretes.NeroCustomerManager;
import Concretes.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {

		Customer customer1 = new Customer (1 , "Kaðan" , "Esen", 1997, "3058465987" );

		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());

		customerManager.save(customer1);
		System.out.println();

	}

}
