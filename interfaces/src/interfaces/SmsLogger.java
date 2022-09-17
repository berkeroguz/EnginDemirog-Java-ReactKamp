package interfaces;

public class SmsLogger implements Logger { // loggeri implemente eder.  Logger'ı smsloggera uyarla demek.

	@Override
	public void log(String message) {
	System.out.println("Sms Gönderildi : " + message);
		
	}
	

}
