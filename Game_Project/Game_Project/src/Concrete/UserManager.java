package Concrete;

import Abstract.UserService;
import Abstract.UserValidationService;
import Entities.User;

public class UserManager implements UserService {
	
	private UserValidationService userValidationService;	 

	public UserManager(UserValidationService userValidationService) {
		
		this.userValidationService = userValidationService;
	}

	@Override
	public void add(User user) {
		if(userValidationService.checkIfRealPerson(user)) {
			System.out.println("Kullan�c� Eklendi :  " + user.getFirstName() + " " + user.getLastName());
		}else {
			System.out.println("Yanl�� giri� l�tfen tekrar deneyiniz!!!");
		}
		
	}

	@Override
	public void update(User user) {
		if(userValidationService.checkIfRealPerson(user)) {
			System.out.println("Kullan�c� G�ncellendi :  " + user.getFirstName() + " " + user.getLastName());
		}else {
			System.out.println("Yanl�� giri� l�tfen tekrar deneyiniz!!!");
		}
		
	}

	@Override
	public void delete(User user) {
		if(userValidationService.checkIfRealPerson(user)) {
			System.out.println("Kullan�c� Silindi :  " + user.getFirstName() + " " + user.getLastName());
		}else {
			System.out.println("Yanl�� giri� l�tfen tekrar deneyiniz!!!");
		}
		
	}

}
