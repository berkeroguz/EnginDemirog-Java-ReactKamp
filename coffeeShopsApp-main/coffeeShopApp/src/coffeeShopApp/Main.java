package coffeeShopApp;

import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concrete.StarbucksCustomerManager;
import entities.Customer;


public class Main {

	public static void main(String[] args) throws Exception {

		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"Cem Yasin","Üzüm",2001,(long)242206830));
		
	}

}
