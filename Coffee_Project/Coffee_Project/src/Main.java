import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapter.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager base1CustomerManager= new StarbucksCustomerManager(new MernisServiceAdapter());
		 
		 Customer customer = new Customer();
		 customer.setId(1);
		 customer.setFirstName("Koray");
		 customer.setLastName("Halat");
		 customer.setDateOfBirth(LocalDate.of(1979, 11, 26));
		 customer.setNationalityId("12345");
		 
		 base1CustomerManager.Save(customer);
	}

}
