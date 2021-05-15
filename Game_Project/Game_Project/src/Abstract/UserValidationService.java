package Abstract;

import Entities.User;

public interface UserValidationService {

	boolean checkIfRealPerson(User user);
}
