package concrete;

import abstracts.ICustomerCheckService;
import entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean checkIfRealPearson(Customer customer) {

		return true;
	}

} 
