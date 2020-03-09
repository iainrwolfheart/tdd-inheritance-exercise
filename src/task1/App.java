package task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
		String mainMenu;
		String empType = "";
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

		List<Employee> employeeList = new ArrayList<>();

		Random rand = new Random(); 
		Department deptChoice = deptList.get(rand.nextInt(deptList.size()));
		Car carChoice = carList.get(rand.nextInt(carList.size()));

		do {
			mainMenu = JOptionPane.showInputDialog("What would you like to do?\n"
					+ "1. Add an employee\n"
					+ "2. Delete an employee\n"
					+ "3. Find an employee\n"
					+ "4. Display all employees\n"
					+ "5. Exit");

			if (mainMenu.equals("1")) {
				empType = JOptionPane.showInputDialog("Declare an employee:\n)"
						+ "1. Employee\n"
						+ "2. Manager\n"
						+ "3. Contractor\n"
						+ "4. Exit");

				switch (empType) {
				case "1": 
					firstName = JOptionPane.showInputDialog("What is your first name?");
					surname = JOptionPane.showInputDialog("What is your surname?");
					id = Integer.parseInt(JOptionPane.showInputDialog("What is your ID?"));
					Employee employee = new Employee(firstName, surname, deptChoice, carChoice, id);
					employeeList.add(employee);
					break;
				case "2": 
					firstName = JOptionPane.showInputDialog("What is your first name?");
					surname = JOptionPane.showInputDialog("What is your surname?");
					id = Integer.parseInt(JOptionPane.showInputDialog("What is your ID?"));
					double budget = Double.parseDouble(JOptionPane.showInputDialog("What is your budget?"));
					Manager manager = new Manager(firstName, surname, deptChoice, carChoice, id, budget);
					employeeList.add(manager);
					break;
				case "3": 
					firstName = JOptionPane.showInputDialog("What is your first name?");
					surname = JOptionPane.showInputDialog("What is your surname?");
					id = Integer.parseInt(JOptionPane.showInputDialog("What is your ID?"));
					String code = JOptionPane.showInputDialog("What is your contractor code?");
					double dailyRate = Double.parseDouble(JOptionPane.showInputDialog("What is your daily rate?"));
					Contractor contractor = new Contractor(firstName, surname, deptChoice, carChoice, id, code, dailyRate);
					employeeList.add(contractor);
					break;
				case "4":
					System.out.println("Exited"); 
					break;
				default: System.out.println("Please enter a valid option"); break;
				}
			}


			else if (mainMenu.equals("2")) {
				int index = findEmployee(employeeList);
				if (index != -1) {
					employeeList.remove(index);
				}
				else JOptionPane.showInputDialog("That employee is not in our records"); 
			}

			else if (mainMenu.equals("3")) {
				int index = findEmployee(employeeList);
				if (index != -1) {
					System.out.println(employeeList.get(index).toString());
				}
				else System.out.println("Cannot find employee!");
			}

			else if (mainMenu.equals("4")) {
				System.out.println("Display employee functionality");
				String displayEmployeeList = "Employees currently on file:\n";
				for (Employee employee : employeeList) {
					displayEmployeeList += employee.toString() + "\n";
				}
				JOptionPane.showMessageDialog(null, displayEmployeeList);
			}
			else if (mainMenu.equals("5")) {
				System.out.println("Exit functionality");
			}

		}
		while (!mainMenu.contentEquals("5"));
	}

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
}
