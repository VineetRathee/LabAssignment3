package Assignment3;

public class InterfaceApp {
	public static void main(String[] args) {
		
	payable Emp1 = new SalariedEmployee(5000, 5);
	
	payable Emp2= new HourlyEmployee(40, 300);
	
	payable Emp3= new ComEmployee(500);
	
	payable invoice  = new Invoice("Wheels","Alloy type wheels",4,20000);
	
	System.out.println(Emp1.getPayment());
	System.out.println(Emp2.getPayment());
	System.out.println(Emp3.getPayment());
	System.out.println(invoice.getPayment());
	
	}
	

}
