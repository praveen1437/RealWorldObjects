package Amazon;

public class Employee {
     private String employeeName;
     private double salary;
     private String designation;
	public Employee(String employeeName, double salary, String designation) {
		super();
		this.employeeName = employeeName;
		this.salary = salary;
		this.designation = designation;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
}
