package business.concrete;

import java.util.List;

import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {
	
	private UserDao userDao;

	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		userDao.add(user);
		
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
		
	}

	@Override
	public void update(User user) {
		userDao.update(user);
		
	}

	@Override
	public User getId(int id) {
		userDao.getId(id);
		return null;
	}

	@Override
	public User getByEmail(String email) {
		userDao.getByEmail(email);
		return null;
	}

	@Override
	public List<User> getAll() {
		
		return userDao.getAll();
	}

}
