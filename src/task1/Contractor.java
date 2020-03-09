package task1;

public class Contractor extends Employee {
	private String code;
	private double dailyRate;

	public Contractor(String name, String surname, Department dept, Car car, int id, String code, double dailyRate) {
		super(name, surname, dept, car, id);
		this.code = code;
		this.dailyRate = dailyRate;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public double getDailyRate() {
		return dailyRate;
	}

	public void setDailyRate(double dailyRate) {
		this.dailyRate = dailyRate;
	}

	@Override
	public String toString() {
		return super.toString() + " Contractor [code=" + code + ", dailyRate=" + dailyRate + "]";
	}

}
