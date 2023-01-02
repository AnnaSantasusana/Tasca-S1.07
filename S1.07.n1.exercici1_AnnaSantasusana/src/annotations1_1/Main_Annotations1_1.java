package annotations1_1;

public class Main_Annotations1_1 {

	public static void main(String[] args) {
		
		Worker worker1 = new Worker("Genís", "Machado", 22);
		System.out.println(worker1.toString() + worker1.calculateSalary(100));
		
		OnlineWorker onlineWorker1 = new OnlineWorker("Laia", "Molina", 15);
		System.out.println(onlineWorker1.toString() + onlineWorker1.calculateSalary(88));
		
		OnSiteWorker onSiteWorker1 = new OnSiteWorker("Manel", "Leal", 12, 200);
		System.out.println(onSiteWorker1.toString() + onSiteWorker1.calculateSalary(160));
	}

}
