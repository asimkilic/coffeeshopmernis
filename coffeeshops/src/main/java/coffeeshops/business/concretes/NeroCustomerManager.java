package coffeeshops.business.concretes;

import coffeeshops.business.abstracts.CustomerService;
import coffeeshops.dataAccess.abstracts.CustomerDao;
import coffeeshops.entities.concretes.Customer;

public class NeroCustomerManager implements CustomerService{
	private CustomerDao customerDao;
	

	public NeroCustomerManager(CustomerDao customerDao) {
		
		this.customerDao = customerDao;
	}


	public void add(Customer customer) {
		this.customerDao.add(customer);
		
	}

}
