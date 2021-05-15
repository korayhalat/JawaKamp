package Concrete;

import Abstract.CampaingService;
import Entities.Campaing;

public class CampaingManager implements CampaingService {

	@Override
	public void add(Campaing campaing) {
		
		System.out.println("Kampanya Eklenmiştir :  " + " " + campaing.getCampaingName());
	}

	@Override
	public void update(Campaing campaing) {
		
		System.out.println("Kampanya Güncellenmiştir :  " + " " + campaing.getCampaingName());
	}

	@Override
	public void delete(Campaing campaing) {
		
		System.out.println("Kampanya Süresü Bitmiştir :  " + " " + campaing.getCampaingName());
	}

}
