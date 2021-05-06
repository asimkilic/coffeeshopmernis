package coffeeshops.core.concretes;


import java.rmi.RemoteException;


import coffeeshops.core.abstracts.CustomerCheckService;
import coffeeshops.entities.concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class mernisManagerAdapter implements CustomerCheckService{

	
	public boolean checkCustomer(Customer customer) throws RemoteException {
		String endpoint = "https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx";
		KPSPublicSoap service = new KPSPublicSoapProxy(endpoint);
		String name=customer.getFirstName();
		name=name.toUpperCase();
		String lastName=customer.getLastName();
		lastName=lastName.toUpperCase();
		long nationalityId=Long.parseLong(customer.getNationalityId());
		int year=customer.getDateOfBirth().getYear();
		
		if(service.TCKimlikNoDogrula(nationalityId,name,lastName,year)){
			return true;
		}
		
		return false;
		
	}

}


