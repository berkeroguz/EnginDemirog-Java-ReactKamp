package arraysDemo;

public class Main {

	public static void main(String[] args) {
		
		String[] ogrenciler = new String [3];
		ogrenciler[0]="Engin";
		ogrenciler[1]="Ahmet";
		ogrenciler[2]="Sinan";
		int [] a={1,2,3,4};
		System.out.println(a[2]);
		
		for(String ogrenci:ogrenciler) //ogrenci değişkenine "ogrenciler" dizisindeki tüm indexleri tek tek atar.
			//ogrenciler dizisini gezer.
		{
			System.out.println(ogrenci);
		}
		
	}
	
	

}
