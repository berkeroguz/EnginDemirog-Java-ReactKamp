package classesWithAttiributes;

public class Product {
	
	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private String _renk;
	private String _kod;
	
	
	//getter
	public int getId() {
		return _id;
	}
	
	
	//setter
	public void setId(int id) {
		_id=id;  //This. demek bu class'ın içindeki
	}


	private String get_name() {
		return _name;
	}


	private void set_name(String _name) {
		this._name = _name;
	}

	
}
