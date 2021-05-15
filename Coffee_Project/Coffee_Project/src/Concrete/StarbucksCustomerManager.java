package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
private CustomerCheckService customerCheckService;
	

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		
	
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void Save(Customer customer) {
		if(customerCheckService.checkIfRealCustomer(customer)) {
			System.out.println("Starbucks Data Base ine Kaydedildi : " + customer.getFirstName() + " " + customer.getLastName());
		}
		else {
			System.out.println("Aranan Kiþi Bulunamadý");
		}
		
}
	
	
		
	
}