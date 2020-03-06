package lpu.in;



public class Manager extends Employee{
	
	protected float hra;
	
	public Manager(String name, String address, int age, char gender, float basicSalary, float hra2) {
		super(name, address, age, gender, basicSalary);
		this.hra=hra2;
	}
	
	public float getHumanResourses()
	{
		
		
		return hra;
		
	}
	

	public void setHra(float hra)
	{
		this.hra=hra;
		
	}

	

	

}
