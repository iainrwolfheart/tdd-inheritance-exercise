package task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;

public class HelperClass {

	public static int findEmployee(List<Employee> employeeList) {
		System.out.println("Find employee functionality");
		String surnameToFind = JOptionPane.showInputDialog("Enter the surname of the employee you wish to find");
		for (Employee employee : employeeList) {
			if (employee.getSurname().equalsIgnoreCase(surnameToFind)) {
				JOptionPane.showMessageDialog(null, employee.toString());

				return employeeList.indexOf(employee);
			}
		}
		return -1;
	}

	public static Employee addEmployee (String empType) {

		String firstName = "";
		String surname = "";
		int id = 0;

		Department siSquad = new Department(1, "SI Squad", "W2");
		Department uhs = new Department(2, "UHS", "W1");

		Car civic = new Car("WE68 EET", "Honda", "Civic");
		Car aClass = new Car("TT67 GHT", "Mercedes", "A Class");
		Car i10 = new Car("HJ63 DTK", "Hyundai", "i10");

		List<Department> deptList = new ArrayList<>();
		deptList.add(siSquad);
		deptList.add(uhs);

		List<Car> carList = new ArrayList<>();
		carList.add(civic);
		carList.add(aClass);
		carList.add(i10);

		Random rand = new Random(); 
		Department deptChoice = deptList.get(rand.nextInt(deptList.size()));
		Car carChoice = carList.get(rand.nextInt(carList.size()));

		switch (empType) {
		case "1": 
			firstName = JOptionPane.showInputDialog("What is your first name?");
			surname = JOptionPane.showInputDialog("What is your surname?");
			id = Integer.parseInt(JOptionPane.showInputDialog("What is your ID?"));
			Employee employee = new Employee(firstName, surname, deptChoice, carChoice, id);
			return employee;
		case "2": 
			firstName = JOptionPane.showInputDialog("What is your first name?");
			surname = JOptionPane.showInputDialog("What is your surname?");
			id = Integer.parseInt(JOptionPane.showInputDialog("What is your ID?"));
			double budget = Double.parseDouble(JOptionPane.showInputDialog("What is your budget?"));
			Manager manager = new Manager(firstName, surname, deptChoice, carChoice, id, budget);
			return manager;
		case "3": 
			firstName = JOptionPane.showInputDialog("What is your first name?");
			surname = JOptionPane.showInputDialog("What is your surname?");
			id = Integer.parseInt(JOptionPane.showInputDialog("What is your ID?"));
			String code = JOptionPane.showInputDialog("What is your contractor code?");
			double dailyRate = Double.parseDouble(JOptionPane.showInputDialog("What is your daily rate?"));
			Contractor contractor = new Contractor(firstName, surname, deptChoice, carChoice, id, code, dailyRate);
			return contractor;
		case "4":
			System.out.println("Exited"); 
			break;
		default: return null;
		}
		return null;
	}

	public static void displayEmployees(List<Employee> employeeList) {
		if (employeeList.size() > 0) {
			System.out.println("Display employee functionality");
			String displayEmployeeList = "Employees currently on file:\n";
			for (Employee employee : employeeList) {
				displayEmployeeList += employee.toString() + "\n";
			}
			JOptionPane.showMessageDialog(null, displayEmployeeList);
		}
		else JOptionPane.showMessageDialog(null, "Nobody works here.");
	}
}
