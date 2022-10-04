package abstractClasses;

public class Main {

	public static void main(String[] args) {
		WomanGameCalculator woman = new WomanGameCalculator();
		
		GameCalculator gameCalculator = new KidsGameCalculator();
		gameCalculator.hesapla();   

	}

}
