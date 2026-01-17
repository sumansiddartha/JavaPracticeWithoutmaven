package Practice.Comparator;

public class Employee {
	String name;
    int age;
    double salary;
    long mobile;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public Employee(String name, int age, double salary, long mobile) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.mobile = mobile;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", mobile=" + mobile + "]";
	}
	
    

}
