package classes;

public class Main {

	public static void main(String[] args) {
		
		//Classlar referans tiptir.
		CustomerManager customerManager = new CustomerManager();
		
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		//value Type
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2=sayi1;
		sayi1=30;
		System.out.println(sayi2);

	}

}
