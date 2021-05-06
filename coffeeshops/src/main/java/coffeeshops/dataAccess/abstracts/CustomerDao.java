package coffeeshops.dataAccess.abstracts;

import java.util.List;

import coffeeshops.entities.concretes.Customer;

public interface CustomerDao {
	void add(Customer customer);
	void update(Customer customer);
	void delete(Customer customer);
	Customer get(int id);
	List<Customer> getAll(); // List-> interface 
}
