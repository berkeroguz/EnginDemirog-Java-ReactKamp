package inharitance2;

public class FileLogger extends Logger {

	@Override // kod okunabilirliği için yazıyoruz yoksa gerek yok.
	public void log() {
		
		System.out.println("Dosya Loglandı.");
		
	}


}
