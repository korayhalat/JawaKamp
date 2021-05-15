package business.abstracts;

import entities.concretes.User;

public interface UserValidationService {

	boolean validate(User user);
}
