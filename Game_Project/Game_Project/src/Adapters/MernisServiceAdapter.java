package Adapters;

import Abstract.UserValidationService;
import Entities.User;

public class MernisServiceAdapter implements UserValidationService {

	@Override
	public boolean checkIfRealPerson(User user) {
		
		UserValidation checkUser = new UserValidation();
		boolean result = true;;
		
		try {
			result=checkUser.userValidate(Long.parseLong(user.getIdentityNumber()),
					user.getFirstName().toUpperCase(),user.getLastName().toUpperCase(),
					user.getBirthOfDate().getYear());
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	
}
