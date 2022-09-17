package Adaptors;

import java.rmi.RemoteException;
import java.security.KeyPairGeneratorSpi;

import Abstracts.ICustomerCheckService;
import Entities.Customer;

public class MernisServiceAdapter implements ICustomerCheckService {
	
	@Override
    public boolean checkIfRealPerson(Customer customer) {
        KPSPublicSoapProxy client=new KPSPublicSoapProxy();
        try {
            return  client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
                     customer.getFirstName().toUpperCase(),
                     customer.getLastName().toUpperCase(),
                     customer.getDateOfBirth());
        } catch (NumberFormatException | RemoteException e) {
            e.printStackTrace();
        } 
        return true;


    }

}