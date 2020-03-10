package task1;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class App {

	public static void main(String[] args) {
		String mainMenu;
		String empType = "";

		List<Employee> employeeList = new ArrayList<>();

		do {
			mainMenu = JOptionPane.showInputDialog("What would you like to do?\n"
					+ "1. Add an employee\n"
					+ "2. Delete an employee\n"
					+ "3. Find an employee\n"
					+ "4. Display all employees\n"
					+ "5. Exit");

			if (mainMenu.equals("1")) {
				empType = JOptionPane.showInputDialog("Declare an employee:\n"
						+ "1. Employee\n"
						+ "2. Manager\n"
						+ "3. Contractor\n"
						+ "4. Exit");
				
				Employee employee = HelperClass.addEmployee(empType);
				if (employee == null) {
					System.out.println("Please enter a valid option"); 
				}
				else employeeList.add(employee);
			}

			else if (mainMenu.equals("2")) {
				int index = HelperClass.findEmployee(employeeList);
				if (index != -1) {
					employeeList.remove(index);
				}
				else JOptionPane.showInputDialog("That employee is not in our records"); 
			}

			else if (mainMenu.equals("3")) {
				int index = HelperClass.findEmployee(employeeList);
				if (index != -1) {
					System.out.println(employeeList.get(index).toString());
				}
				else System.out.println("Cannot find employee!");
			}

			else if (mainMenu.equals("4")) { 
				HelperClass.displayEmployees(employeeList);
			}
			
			else if (mainMenu.equals("5")) {
				System.out.println("Exit functionality");
			}

		}
		while (!mainMenu.contentEquals("5"));
	}

}
