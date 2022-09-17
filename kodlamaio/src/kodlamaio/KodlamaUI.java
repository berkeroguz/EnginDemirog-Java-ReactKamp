package kodlamaio;

public class KodlamaUI {
	private UsersManager user;
	private String newname;
	
	public KodlamaUI(UsersManager user, String name){
		this.user = user;
		this.newname = name;
		
	}
	
	public void Add() {
		
		System.out.println("NEW ACCOUNT");
		user.add(this.newname);
		
	}

}
