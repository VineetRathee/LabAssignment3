package Assignment3;

public class HourlyEmployee extends Employee {
	private double salaryPerHour;
	private int noOfhour;
	public HourlyEmployee() {
		
	}
	public HourlyEmployee(double salaryPerHour, int noOfhour) {
		this.salaryPerHour= salaryPerHour;
		this.noOfhour = noOfhour;
	}
	public double getsalary() {
		return salaryPerHour* (double)noOfhour;
	}
	public void setSalary(double percentage) {
		salaryPerHour= salaryPerHour + salaryPerHour*(percentage/(double)100);
	}
	

}
