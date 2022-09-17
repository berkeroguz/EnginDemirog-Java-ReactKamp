package Abstracts;

import Entities.Customer;

public class BaseCustomerManager implements ICustomerService {

	@Override
	public void save(Customer customer) throws Exception {
		System.out.println("Saved to database :" + customer.getFirstName() + " " + customer.getLastName());

	}

}
