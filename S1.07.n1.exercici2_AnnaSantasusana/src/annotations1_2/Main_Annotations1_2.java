package annotations1_2;

public class Main_Annotations1_2 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		OnSiteWorker onSiteWorker1 = new OnSiteWorker("Clara", "Martinez", 11, 55);
		System.out.println(onSiteWorker1.calculateSalary(92));

		OnlineWorker onlineWorker1 = new OnlineWorker("Joan", "Pascual", 18);
		System.out.println(onlineWorker1.calculateSalary(78));
	}

}
