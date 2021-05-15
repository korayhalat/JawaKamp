package business.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserService {

	void add(User user);
	void delete(User user);
	void update(User user);
	User getId(int id);
	User getByEmail(String email);
	List<User> getAll();
}
