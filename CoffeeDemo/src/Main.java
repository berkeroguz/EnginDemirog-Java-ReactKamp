
public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager();
		Customer customer = new Customer ();
		customer.setId(1);
		customer.setFirstName(" Sümeyye");
		customer.setLastName("Oğuz");
		customer.setDateofBirth(10);
		customer.setDationalityId("123");
		customerManager.Save(customer);
		

	}

}
