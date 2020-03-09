package task1;

public class Car {
	private String regNo;
	private String make;
	private String model;
	
	public Car(String regNo, String make, String model) {
		super();
		this.regNo = regNo;
		this.make = make;
		this.model = model;
	}

	public String getRegNo() {
		return regNo;
	}
	@Override
	public String toString() {
		return "Car [regNo=" + regNo + ", make=" + make + ", model=" + model + "]";
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
}
