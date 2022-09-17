
public class Customer implements IEntity  {
	
	int Id;
	String FirstName;
	String LastName;
	int DateofBirth;
	String DationalityId;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getDateofBirth() {
		return DateofBirth;
	}
	public void setDateofBirth(int dateofBirth) {
		DateofBirth = dateofBirth;
	}
	public String getDationalityId() {
		return DationalityId;
	}
	public void setDationalityId(String dationalityId) {
		DationalityId = dationalityId;
	}
	
	
	

}
