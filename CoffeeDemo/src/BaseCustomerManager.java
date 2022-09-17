
public abstract class BaseCustomerManager implements ICustomer {

	
	public void save(Customer customer) throws Exception{
		System.out.println("Saved to database :" + customer.getFirstName() 
		+ " " + customer.getLastName());

	}
	

}
