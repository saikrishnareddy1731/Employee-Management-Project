package lpu.in;



public class Engineer extends Employee{
	
	protected float ot;

	public Engineer(String name, String address, int age, char gender, float basicsalary, float ot) {
		super(name, address, age, gender, basicsalary);
		this.ot=ot;
		
	}

	public float getOverTime() {
		return ot;
	}

	public void setOt(float ot) {
		this.ot = ot;
	}

	
	

}
