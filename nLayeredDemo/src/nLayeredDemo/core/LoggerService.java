package nLayeredDemo.core;

public interface LoggerService {
	//Başkarlarının servislerini eklerken buna benzer yapı kullanırız.
	//Örnek olarak bu projede JLOGGER paketini bu sisteme yüklüyoruz.
	
	void logToSystem(String message);

}
