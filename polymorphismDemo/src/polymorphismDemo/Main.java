package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager(new EmailLogger()); //New ile constructor'ı çalıştırıp Logger gönderiyoruz.
		customerManager.add();

	}

}
