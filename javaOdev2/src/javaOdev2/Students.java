package javaOdev2;

public class Students {
	
	public Students()
	{
		System.out.println("Sistem constructor çalıştı.");  //BURAYA YAZILAN KOD MAIN'DE NEW İLE ÇAĞIRILDIĞINDA ÇALIŞIR.
	}
	
	public Students (int id, String name, String surname, int age, String part ) //constructor oluşturuyoruz.
	{
		this.id = id;
		this.name=name;
		this.surname=surname;
		this.age=age;
		this.part=part;
				
	}
	
	
	int id;
	String name;
	String surname;
	int age;
	String part;

}
