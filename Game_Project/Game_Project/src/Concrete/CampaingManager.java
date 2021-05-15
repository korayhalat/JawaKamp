package Concrete;

import Abstract.CampaingService;
import Entities.Campaing;

public class CampaingManager implements CampaingService {

	@Override
	public void add(Campaing campaing) {
		
		System.out.println("Kampanya Eklenmiþtir :  " + " " + campaing.getCampaingName());
	}

	@Override
	public void update(Campaing campaing) {
		
		System.out.println("Kampanya Güncellenmiþtir :  " + " " + campaing.getCampaingName());
	}

	@Override
	public void delete(Campaing campaing) {
		
		System.out.println("Kampanya Süresü Bitmiþtir :  " + " " + campaing.getCampaingName());
	}

}
