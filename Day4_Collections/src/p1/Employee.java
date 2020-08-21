package p1;

public class Employee {

	private String name;
	private int id;
	private int salary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, int id, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		// Employee 
		
		if(obj instanceof Employee)
		{
			Employee e = (Employee)obj;
			
			boolean a = e.name.equals(this.name); if(a == false) return false;
			boolean b = (e.salary == this.salary); if(!b) return false;
			boolean c = (e.id == this.id);
			
			if(a && b && c) return true;
			else return false;
			
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	
	
	
	
}//end of class









