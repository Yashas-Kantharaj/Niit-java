package streamapi;

public class Employee implements Comparable<Employee> {
	String name;
	int salary;
	
	public Employee(String name, int salary) {
		this.name=name;
		this.salary=salary;
	}
	
	public String toString() {
		return this.name + "\t" +this.salary;
	}

	@Override
	public int compareTo(Employee o) {
		return (this.salary > o.salary) ? 1 :(this.salary < o.salary) ? -1 : 0;
			//return name.compareTo(o.name);
	}
	

}
