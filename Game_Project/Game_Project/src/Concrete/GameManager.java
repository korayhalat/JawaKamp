package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Oyun EKlendi :  " + game.getGameName() );
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun G�ncellendi :  " + game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Silme i�lemi Ba�ar�l� :  " + game.getGameName() );
		
	}

}
