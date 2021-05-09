package Coffeeshop_project;

import java.time.LocalDate;

import Coffeeshop_project.abstracts.BaseCustomerManager;
import Coffeeshop_project.adapters.MernisServiceAdapter;
import Coffeeshop_project.concretes.StarbucksCustomerManager;
import Coffeeshop_project.entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		Customer person = new Customer();
		person.setId(1);
		person.setFirstName("Semih");
		person.setLastName("Polat");
		person.setBirthday(LocalDate.of(1996, 9, 4));
		person.setNationalId("01234567890");
		
		
		baseCustomerManager.save(person);

	}

}
