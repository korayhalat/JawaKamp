import business.concrete.UserManager;
import business.concrete.VerificationManager;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user = new User();
		user.setId(1);
		user.setFirstName("Koray");
		user.setLastName("Halat");
		user.setEmail("koray@koray.com");
		user.setPassword("987654321");
		
		UserManager userManager = new UserManager(new HibernateUserDao());
		userManager.add(user);
		
		VerificationManager manager = new VerificationManager(userManager, null);
		manager.logIn("koray@koray.com", "987654321");
		manager.register(1, "Koray", "Halat", "koray@koray.com", "987654321");

	}

}
