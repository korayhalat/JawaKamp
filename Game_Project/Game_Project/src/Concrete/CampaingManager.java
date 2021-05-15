package Concrete;

import Abstract.CampaingService;
import Entities.Campaing;

public class CampaingManager implements CampaingService {

	@Override
	public void add(Campaing campaing) {
		
		System.out.println("Kampanya Eklenmi�tir :  " + " " + campaing.getCampaingName());
	}

	@Override
	public void update(Campaing campaing) {
		
		System.out.println("Kampanya G�ncellenmi�tir :  " + " " + campaing.getCampaingName());
	}

	@Override
	public void delete(Campaing campaing) {
		
		System.out.println("Kampanya S�res� Bitmi�tir :  " + " " + campaing.getCampaingName());
	}

}
