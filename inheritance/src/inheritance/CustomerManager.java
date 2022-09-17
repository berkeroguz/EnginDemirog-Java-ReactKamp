package inheritance;

import java.util.Iterator;

public class CustomerManager {
	
	public void add(Customer customer) {
		
		System.out.println(customer.customerNumber + "Kaydedildi.");
		
		
		
	}
	
	public void addMultiple(Customer [] customers)
	{
		for (Customer customer : customers) {
			
			this.add(customer);
		}
	}

}
