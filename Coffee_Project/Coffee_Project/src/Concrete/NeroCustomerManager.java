package Concrete;

import Abstract.BaseCustomerManager;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {

	@Override
	public void Save(Customer customer) {
		System.out.println("Veri Taban�na Kaydedildi : " + customer.getFirstName()+ " "+ customer.getLastName());
		
	}

}
