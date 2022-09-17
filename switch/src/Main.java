
public class Main {

	public static void main(String[] args) {
		
		//Dallandırma yapıyoruz kardeşim benim
		
		char grade = 'G';
		
		switch(grade)
		{
		      case 'A':
		      	System.out.println("Müğkemmel : Geçtiniz.");
		      	break;
		      case 'B':
		      	System.out.println("Çok Güzel Geçtiniz ");
		      	break;
		      case 'C':
		      	System.out.println("iyi : Geçtiniz");
		      	break;
		      case 'D':
		      	System.out.println("Fena değil : Geçtiniz");
		      	break;
		      case 'F':
		      	System.out.println("Malesef kaldınız");
		      	break;
		      	default:
		      		System.out.println("Geçersiz not girdiniz.");
		      		
		      		//AYNI CASELERE AYNI İFADEYİ GİRMEK İSTERSEN;
		      		//öRNEK : case'B':
		      		//		  case'C' :
		      		//                    //ortak break;
		      		
		
		}

	}

}
