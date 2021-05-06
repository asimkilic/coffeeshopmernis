package coffeeshops.business.concretes;

import java.rmi.RemoteException;

import coffeeshops.business.abstracts.CustomerService;
import coffeeshops.core.abstracts.CustomerCheckService;
import coffeeshops.dataAccess.abstracts.CustomerDao;
import coffeeshops.entities.concretes.Customer;

public class StarbucksCustomerManager implements CustomerService{

	private CustomerDao customerDao;
	private CustomerCheckService customerCheckService;
	public StarbucksCustomerManager(CustomerDao customerDao, CustomerCheckService customerCheckService) {
		
		this.customerDao = customerDao;
		this.customerCheckService = customerCheckService;
	}
	public void add(Customer customer) {

		try {
			if(customerCheckService.checkCustomer(customer))
			{
				this.customerDao.add(customer);
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Bir hata oluþtur tekrar deneyiniz.");
		}
		
	}

}
