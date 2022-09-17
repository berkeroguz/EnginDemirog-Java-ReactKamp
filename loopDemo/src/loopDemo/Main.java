package loopDemo;

public class Main {

	public static void main(String[] args) {
		//For
		
		for (int i = 1;i<10;i++)
		{
			System.out.println(i);  //Döngü başladığında ilk olarak şarta bakma direkt döngüye girer.
		}
		System.out.println("For döngüsü bitti");
		
		//While Döngüsü
		int i=1;
		while(i<10)
		{
			System.out.println(i);  //içinde sayaç kullanman gerekir.
			i+=2;
		}
		
		System.out.println("While Döngüsü Bitti");
		
		//Do-While döngüsü çok da gerekli değil :D
		
		int j=1;
		do 
		{
			System.out.println(j); //Yapılacak işlemler burada  //WHİLE VE do-while arasındaki fark şart uymasa bile dowhile 1 kere çalışır.
			j++;
		}
		while(j<10);        //Şartını buraya yazıyosun
		System.out.println("Do-while döngüsü bitti"); //loglama işlemlerinde kullanılır.

	}

}
