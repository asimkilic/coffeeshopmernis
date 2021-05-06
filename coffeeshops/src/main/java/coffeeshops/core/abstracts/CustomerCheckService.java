package coffeeshops.core.abstracts;

import java.rmi.RemoteException;

import coffeeshops.entities.concretes.Customer;

public interface CustomerCheckService {

	boolean checkCustomer(Customer customer) throws RemoteException;
}
