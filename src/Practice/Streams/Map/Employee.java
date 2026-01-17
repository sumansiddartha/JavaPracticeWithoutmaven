package Practice.Streams.Map;

public class Employee {
	double salary;
	String name;
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee(double salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
	}
	public Employee() {
		super();
		
	}
	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", name=" + name + "]";
	}
	

}
