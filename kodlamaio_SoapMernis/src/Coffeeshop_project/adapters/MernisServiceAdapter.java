package Coffeeshop_project.adapters;

import java.rmi.RemoteException;

import Coffeeshop_project.abstracts.PersonCheckServices;
import Coffeeshop_project.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PersonCheckServices{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		boolean result;
		
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		
		try {
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(
					Long.parseLong(customer.getNationalId()),
					customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(),
					customer.getBirthday().getYear());
		}
		catch(RemoteException e) {
			result = false;
			e.printStackTrace();
		}
		
		return result;
	}
	
}
