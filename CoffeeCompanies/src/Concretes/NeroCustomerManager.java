package Concretes;

import Abstracts.BaseCustomerManager;
import Abstracts.ICustomerCheckService;
import Adaptors.MernisServiceAdapter;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {

	private ICustomerCheckService customerCheckService;

	public NeroCustomerManager(ICustomerCheckService customerCheckService) {

		this.customerCheckService = customerCheckService;
	}

	public void save(Customer customer) throws Exception {

		if (customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);

		} else {
			System.out.println("Not a valid person.");

		}

	}

}
