package coffeeshops;

import java.time.LocalDate;

import coffeeshops.business.abstracts.CustomerService;
import coffeeshops.business.concretes.StarbucksCustomerManager;
import coffeeshops.core.concretes.mernisManagerAdapter;
import coffeeshops.dataAccess.concretes.HibernateCustomerDao;
import coffeeshops.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer= new Customer(1,"ÝSÝM","SOYÝSÝM",LocalDate.of(2021, 05, 01),"12345678901");
		CustomerService customerService= new StarbucksCustomerManager(new HibernateCustomerDao(),new mernisManagerAdapter());

		customerService.add(customer);
	}

}
