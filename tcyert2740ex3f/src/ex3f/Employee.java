package ex3f;


public class Employee {

	private String name;
	private int idNumber;
	private String department;
	private String position;
	
	public Employee() {
		name = "";
		idNumber = 0;
		department = "";
		position = "";
	}	
	public Employee(int id, String name) {
		this.idNumber = id;
		this.name = name;
		department = "";
		position = "";
	}	
	public Employee(int id, String name, String dept, String pos) {
		this.name = name;
		this.idNumber = id;
		this.department = dept;
		this.position = pos;
	}	
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIdNumber() {
		return this.idNumber;
	}
	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}
	public String getDepartment() {
		return this.department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPosition() {
		return this.position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder("ID #: ");
		str.append(this.idNumber);
		str.append(", Name: ");
		str.append(this.name);
		str.append(", Dept.:");
		str.append(this.department);
		str.append(", Position: ");
		str.append(this.position);
		return str.toString();
	}
	
	
}

