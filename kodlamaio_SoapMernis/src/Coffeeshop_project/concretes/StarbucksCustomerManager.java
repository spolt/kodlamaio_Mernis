package Coffeeshop_project.concretes;

import Coffeeshop_project.abstracts.BaseCustomerManager;
import Coffeeshop_project.abstracts.PersonCheckServices;
import Coffeeshop_project.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	public PersonCheckServices _PersonCheckServices;
	
	public StarbucksCustomerManager(PersonCheckServices _PersonCheckServices) {
		this._PersonCheckServices = _PersonCheckServices;
	}
	
	public void save(Customer customer) {
		if(_PersonCheckServices.checkIfRealPerson(customer) == true) {
			super.save(customer);
		}else {
			MernisException.mernisException();
		}
	}

}
