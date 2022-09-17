package Concretes;

import Abstracts.ICustomerCheckService;
import Abstracts.ICustomerService;
import Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return true;
	}

}
