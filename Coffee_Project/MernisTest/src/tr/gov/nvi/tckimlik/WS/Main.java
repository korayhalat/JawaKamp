package tr.gov.nvi.tckimlik.WS;

import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws RemoteException {
		
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		boolean result = kpsPublic.TCKimlikNoDogrula(Long.parseLong("tc numarasý"), "Ad", "SoyAd", 1979);
		System.out.println("doðrulama :  " + (result ? "baþarýlý : " : " baþarýsýz"));
	}

}
