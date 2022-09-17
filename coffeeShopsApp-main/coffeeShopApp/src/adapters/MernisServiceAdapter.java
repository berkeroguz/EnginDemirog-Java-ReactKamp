package adapters;

//import java.rmi.RemoteException;

import abstracts.ICustomerCheckService;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean checkIfRealPearson(Customer customer) throws Exception {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		return client.TCKimlikNoDogrula((long) customer.getNationalityId(), customer.getFirstName().toUpperCase(),
				customer.getLastName().toUpperCase(), customer.getBirthYear());
	}

}
