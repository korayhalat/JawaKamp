package Abstract;

import Entities.Campaing;
import Entities.Game;
import Entities.User;

public interface SaleService {

	void sale(Game game,User user,Campaing campaing);
}
