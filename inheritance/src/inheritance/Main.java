package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer engin = new IndividualCustomer();
		engin.customerNumber="12";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber ="34";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber="56";
		
		CustomerManager customerManager = new CustomerManager();  //Customer çağırmadık ama yine de çalıştı çünkü diğer classları extend ettik ve POLİFORMİZM uyguladık."
		/*customerManager.add(engin);
		customerManager.add(abc);
		customerManager.add(hepsiBurada);*/
		
		Customer [] customers  = {engin,hepsiBurada,abc};  //POLİFORMizM 
		
		customerManager.addMultiple(customers);

	}

}
