package lpu.in;



public class SalesPerson extends Employee {
	
    protected float commission;
	public SalesPerson(String name, String address, int age, char gender, float basicsalary, float commission) {
		super(name, address, age, gender, basicsalary);
		this.commission=commission;
	}
	
	public float getCommission() {
		return commission;
	}
	public void setCommission(float commission) {
		this.commission = commission;
	}

	
	

}
