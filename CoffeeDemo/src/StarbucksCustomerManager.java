
public class StarbucksCustomerManager extends BaseCustomerManager {
	
	ICustomerCheckService _customerCheckService;
    @Override
	public void Save(Customer customer) {
		
    	if(_customerCheckService.CheckIfRealPerson(customer)==true)
    	{
    		System.out.println("Saved to database :" + customer.getFirstName() 
    		+ " " + customer.getLastName());
    		
    		
    	}
    	else
    	{
    		System.out.println("Not a valid person");
    	}
		
    	
		
	}
	

	
	
	

}
