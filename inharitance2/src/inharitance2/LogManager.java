package inharitance2;

public class LogManager {
	
	public void log(int logType) {
		
		if(logType==1)
		{
			System.out.println("Veritabanına loglandı.");
		}
		else if(logType==2)
		{
			System.out.println("Dosyaya loglandı.");   //Kötü kod.... Birbirinin alternatifi olan kod blokları if ile yönetilmez.
		}
		else
		{
			System.out.println("Email gönderildi.");
		}
	}

}
//1 - Database
//2 - File
//3 - Email