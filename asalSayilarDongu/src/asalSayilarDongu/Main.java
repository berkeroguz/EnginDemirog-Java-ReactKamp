package asalSayilarDongu;

public class Main {

	public static void main(String[] args) {
		
		int sayac = 0;
		for (int sayi=10;sayi<=100;sayi++)
		{
			int kontrol = 0;
			for(int i=2;i<sayi;i++) 
			{
				if (sayi%i==0)  //eğer sayı kendisine gelene herhangi bir sayıya tam bölünmüşse asal değildir o yüzden kontrolü 1 yap
				{
					kontrol =1;
					break;
				}
			}
			//ama döngüden çıktıktan sonra geriye bir tek kendisi kalmıştır o zaman asaldır o yüzden kontrol 0 olarak kalmıştır.
			if (kontrol == 0)
			{
				System.out.println("Asal sayılardan biri = " +sayi);
			}
		}
		
		


	
	}
	


}