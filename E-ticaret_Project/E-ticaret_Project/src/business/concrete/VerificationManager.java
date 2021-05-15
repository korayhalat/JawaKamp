package business.concrete;

import business.abstracts.UserService;
import business.abstracts.UserValidationService;
import core.VerificationService;
import entities.concretes.User;

public class VerificationManager implements VerificationService {
	
	UserService userService;
	UserValidationService userValidationService;

	public VerificationManager(UserService userService, UserValidationService userValidationService) {
		super();
		this.userService = userService;
		this.userValidationService = userValidationService;
	}

	@Override
	public void register(int id, String firstName, String lastName, String email, String password) {
		
		User user = new User(id,firstName,lastName,email,password);
		if(!userValidationService.validate(user)) {
			System.out.println("��lem Ba�ar�s�z, Tekrar Deneyin");
			return;
		}
		System.out.println("��lem Ba�ar�l�");
	}

	@Override
	public void logIn(String email, String password) {
		System.out.println("Giri� ��lemi Ba�ar�l�");
		
	}

	
}
