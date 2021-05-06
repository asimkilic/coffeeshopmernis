package coffeeshops.dataAccess.concretes;

import java.util.List;

import coffeeshops.dataAccess.abstracts.CustomerDao;
import coffeeshops.entities.concretes.Customer;

public class HibernateCustomerDao implements CustomerDao{

	public void add(Customer customer) {
		System.out.println("Customer added : " + customer.getFirstName());
		
	}

	public void update(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	public Customer get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
