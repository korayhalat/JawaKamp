package Concrete;

import Abstract.SaleService;
import Entities.Campaing;
import Entities.Game;
import Entities.User;

public class SaleManager implements SaleService {

	@Override
	public void sale(Game game, User user, Campaing campaing) {
		System.out.println(game.getGameName() + "  oyununu i�in , " + "%"+campaing.getDiscount()+ "  indirim kazand�n�z.");
		System.out.println("Oyunu alan Ki�i :  "+user.getFirstName() + " " +user.getLastName() );
	}

}
