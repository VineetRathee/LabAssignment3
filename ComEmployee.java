package Assignment3;

public class ComEmployee extends Employee {
	public static double commision=20;
	public double sale;
public ComEmployee() {
		
	}
	public ComEmployee(double sale) {
		
		this.sale = sale;
	}
	public double getCommision() {
		return commision;
	}
	public void setCommision(double com) {
		commision = com;
	}
	public double getsalary() {
		return ((double)sale*(double)commision)/(double)(100);
	}
	public void setcommision(double percentage) {
		commision = commision + (commision*percentage)/(double)100;
		
	}

}
