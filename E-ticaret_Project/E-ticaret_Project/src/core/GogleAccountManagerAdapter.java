package core;

public class GogleAccountManagerAdapter implements VerificationService {

	@Override
	public void register(int id, String firtsName, String lastName, String email, String password) {
		GogleAccountManagerAdapter manager = new GogleAccountManagerAdapter();
		manager.register(id, firtsName, lastName, email, password);
		
	}

	@Override
	public void logIn(String email, String password) {
		GogleAccountManagerAdapter manager = new GogleAccountManagerAdapter();
		manager.logIn(email, password);
		
		
	}

}
