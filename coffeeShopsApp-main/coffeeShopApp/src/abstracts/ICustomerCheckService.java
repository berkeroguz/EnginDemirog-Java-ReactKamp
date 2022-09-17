package abstracts;

import entities.Customer;

public interface ICustomerCheckService {
	
     public boolean checkIfRealPearson(Customer customer) throws Exception;

     
}
