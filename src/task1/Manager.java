package task1;

public class Manager extends Employee {
	
	private double budget;


	public Manager(String name, String surname, Department dept, Car car, int id, double budget) {
		super(name, surname, dept, car, id);
		this.budget = budget;
	}

	public double getBudget() {
		return budget;
	}
	
	public void setBudget(double budget) {
		this.budget = budget;
	}

	@Override
	public String toString() {
	
	return super.toString() + " Manager [budget=" + budget + "]";
	}
	
	

}
