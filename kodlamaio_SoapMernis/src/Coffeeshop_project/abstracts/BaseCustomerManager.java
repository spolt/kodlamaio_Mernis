package Coffeeshop_project.abstracts;

import Coffeeshop_project.entities.Customer;

public class BaseCustomerManager implements CustomerServices{
	
	public void save(Customer customer) {
		System.out.println("Saved to DB : " + customer.getFirstName());
	}
}
