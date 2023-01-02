package annotations1_1;

public class OnSiteWorker extends Worker{

	private static int gasoline;
	
	public OnSiteWorker(String name, String surname, int priceHour, int gasoline) {
		super(name, surname, priceHour);
		OnSiteWorker.gasoline = gasoline;
	}

	public static int getGasoline() {
		return gasoline;
	}

	public static void setGasoline(int gasoline) {
		OnSiteWorker.gasoline = gasoline;
	}
	
	@Override
	public String calculateSalary(int hoursWorkedMonth) {
		int totalSalary = hoursWorkedMonth * super.getPriceHour() + OnSiteWorker.getGasoline();
		return "The on-site worker's total salary is " + totalSalary + "€.";
	}
	
	@Override
	public String toString() {
		return "The on-site worker " + super.getName() + " " + super.getSurname() + " earns " + 
				super.getPriceHour() + " € per hour. ";
	}
}
