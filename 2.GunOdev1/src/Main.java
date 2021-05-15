
public class Main {

	public static void main(String[] args) {
		
		Menu menu1 = new Menu("C# Angular","Kampa Hazırlık","Sorular");
		Menu menu2 = new Menu("Jawa + React","Kampa Hazırlık","Sorular");
		Menu menu3 = new Menu("Temel Kurs","Kampa Hazırlık","Sorular");
		
		Menu[] menu = {menu1,menu2,menu3};
		
		for(Menu menuler : menu ) {
			System.out.println(menuler.kurs);
		}
		
		MenuManager menuManager = new MenuManager();
		menuManager.add(menu1);
		menuManager.delete(menu3);
		
		
		

	}

}
