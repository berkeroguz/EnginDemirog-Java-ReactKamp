package abstractDemo;

public class CustomerManager {
	BaseDatabaseMaganer databaseMaganer;
	
	public void getCustomers() {
		databaseMaganer.getData();
	}

}
