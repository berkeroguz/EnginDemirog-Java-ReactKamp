package abstractClasses;

public abstract class GameCalculator {
	//Abstract yapılar new'lenemez.
	//parametresiz döndürülür.
	
	public abstract void hesapla(); //Kim inherit ediyosa hesapla'yı override etmek zorunda. Kendi hesaplasını yazması gerk.
	
	public final void gameOver() { //Bu gameOver'ı kim kullanırsa kullansın hiç değişmeyecek. Override edilemez. final ile yaptık
		System.out.println("Oyun bitti");
	}
}
