package composite;

import java.util.ArrayList;

public class Employee {

	private String name;
	private int salary;
	private String dept;
	private ArrayList<Employee> subOrdinates;
	
	public Employee(String name, String dept, int salary) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		subOrdinates = new ArrayList<Employee>();
	}
	
	public void add(Employee emp) {
		subOrdinates.add(emp);
	}
	
	public void remove(Employee emp) {
		subOrdinates.remove(emp);
	}
	
	public ArrayList<Employee> getSubOrdinates(){
		return subOrdinates;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
}
