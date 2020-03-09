package task1;

public class Employee {

	private String name;
	private String surname;
	private Department dept;
	private Car car;
	private int id;

	public Employee(String name, String surname, Department dept, Car car, int id) {
		super();
		this.name = name;
		this.surname = surname;
		this.dept = dept;
		this.car = car;
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	@Override
	public String toString() {
		return "employee [name=" + name + ", surname=" + surname + ", dept=" + dept.getName() + ", car model=" + car.getModel() + ", id=" + id
				+ "]";
	}

}
