package task1;

public class Department {
	private int deptId;
	private String name;
	private String location;

	public Department(int deptId, String name, String location) {
		super();
		this.deptId = deptId;
		this.name = name;
		this.location = location;
	}

	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", name=" + name + ", location=" + location + "]";
	}
}
