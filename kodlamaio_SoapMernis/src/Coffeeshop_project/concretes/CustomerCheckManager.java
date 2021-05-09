package Coffeeshop_project.concretes;

import Coffeeshop_project.abstracts.PersonCheckServices;
import Coffeeshop_project.entities.Customer;

public class CustomerCheckManager implements PersonCheckServices{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		return true;
	}

}
