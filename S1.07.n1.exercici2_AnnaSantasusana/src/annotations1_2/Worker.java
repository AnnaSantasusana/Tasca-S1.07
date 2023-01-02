package annotations1_2;

public class Worker {
	private String name;
	private String surname; 
	private int priceHour;
	
	public Worker(String name, String surname, int priceHour) {
		this.name = name;
		this.surname = surname;
		this.priceHour = priceHour;
	}
	
	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public int getPriceHour() {
		return priceHour;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setPriceHour(int priceHour) {
		this.priceHour = priceHour;
	}
	
	public String calculateSalaryNew(int hoursWorkedMonth) {
		int totalSalary = hoursWorkedMonth * priceHour;
		return "The worker's total salary is " + totalSalary + "€.";
	}
	
	public String toString() {
		return "The worker " + this.name + " " + this.surname + " earns " + 
				this.priceHour + " € per hour. ";
	}
	
	
}
