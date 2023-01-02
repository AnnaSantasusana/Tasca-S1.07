package annotations1_1;

public class OnlineWorker extends Worker {

	private final int INTERNET = 30;
	
	public OnlineWorker(String name, String surname, int priceHour) {
		super(name, surname, priceHour);
	}
	
	public int getINTERNET() {
		return INTERNET;
	}

	@Override
	public String calculateSalary(int hoursWorkedMonth) {
		int totalSalary = hoursWorkedMonth * super.getPriceHour() + this.getINTERNET();
		return "The online worker's total salary is " + totalSalary + "€.";
		
	}
	
	@Override
	public String toString() {
		return "The online worker " + super.getName() + " " + super.getSurname() + " earns " + 
				super.getPriceHour() + " € per hour. ";
	}

}
