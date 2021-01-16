package Assignment3;

public class SalariedEmployee extends Employee {
    private double salary ;
    private int noOfWeeks=1;
    
    public SalariedEmployee() {
		
	}

	public SalariedEmployee(double salary,int noOfWeeks) {
		this.salary=salary;
		this.noOfWeeks = noOfWeeks;
	}
  @Override
	public double getsalary() {
		return salary*noOfWeeks;
	}

	public void setSalary(int percentage) {
		salary = salary + salary* (percentage/100.0);
	}
	
    
}
