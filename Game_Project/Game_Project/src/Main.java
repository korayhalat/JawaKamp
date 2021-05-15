import java.time.LocalDate;

import Adapters.MernisServiceAdapter;
import Concrete.CampaingManager;
import Concrete.GameManager;
import Concrete.SaleManager;
import Concrete.UserManager;
import Entities.Campaing;
import Entities.Game;
import Entities.User;

public class Main {

	public static void main(String[] args) {
		
		UserManager userManager = new UserManager(new MernisServiceAdapter());
		User user = new User();
		user.setId(1);
		user.setFirstName("Koray");
		user.setLastName("Halat");
		user.setEmail("koray@koray.com");
		user.setIdentityNumber("123456");
		user.setBirthOfDate(LocalDate.of(1979,11,26));
		userManager.add(user);
		
		GameManager gameManager = new GameManager();
		Game game = new Game();
		game.setId(1);
		game.setGameName("Last Of Us");
		game.setDescription("Advanture");
		game.setPrice(450);
		gameManager.add(game);
		
		CampaingManager campaingManager = new CampaingManager();
		Campaing campaing = new Campaing();
		campaing.setId(1);
		campaing.setCampaingName("Yeni Üye Giriþi");
		campaing.setDiscount(25);
		campaingManager.add(campaing);
		
		SaleManager saleManager = new SaleManager();
		saleManager.sale(game, user, campaing);
		
		
		
		
	}

}
