package interfaces;

public class Customer {
	
	private int id;
	private String firstName, lastName;
	
	public Customer() {
		
	}

	public Customer(int id, String firstName, String lastName) {
		//super(); // Bu sınıfı extends eden sınıf varsa onun parametresiz constructor'ını da çalıştır demek
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
