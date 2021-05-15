package core;


public interface VerificationService {

	void register(int id,String firstName,String lastName,String email,String password);
	void logIn(String email,String password);
}
