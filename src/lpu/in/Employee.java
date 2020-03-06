package lpu.in;

public abstract class Employee {
	protected String name;
	protected String address;
	protected int age;
	protected char gender;
	protected float basicsalary;
	
	
	public Employee(String name, String address, int age, char gender, float basicsalary) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
		this.gender = gender;
		this.basicsalary = basicsalary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public float getBasicsalary() {
		return basicsalary;
	}
	public void setBasicsalary(float basicsalary) {
		this.basicsalary = basicsalary;
	}
	

}
