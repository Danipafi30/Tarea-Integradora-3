package model;

public class Employee {
	private String name;
	private String id;
	private double salary;
	private boolean state;
	
	public Employee(String name, String id, double salary, boolean state) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.state = state;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}
	
	

}
