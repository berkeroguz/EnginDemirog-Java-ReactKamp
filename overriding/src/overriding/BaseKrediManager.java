package overriding;

public class BaseKrediManager {
	public double hesapla(double tutar) {  //final keywordu kullanırsan bu methodu kimse ezemez.
		return tutar * 1.18;
	}

}
