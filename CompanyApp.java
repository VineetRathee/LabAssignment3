package Assignment3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

 

public class CompanyApp {
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Which Type of Employee category you belong to ");
        System.out.println(" 1. Salaried Employee ");
        System.out.println(" 2. Hourly Employee");
        System.out.println(" 3. Commision Employee");
        int type=Integer.parseInt(input.readLine());
        
        ArrayList<Employee> employeeList=new ArrayList<Employee>(); 
        double salary;
        int choice ;
        switch(type) {
        case 1 : 
        	 System.out.println("What you want to do ? ");
             System.out.println(" 1. Get Salary of employee ");
             System.out.println(" 2. Incement of salary by some percentage");
             //System.out.println(" 3. Commision Employee");
              choice=Integer.parseInt(input.readLine());
              if(choice==1) {
            	  System.out.println("Salary of employee");
            	  salary = Double.parseDouble(input.readLine());
            	  System.out.println(" No of weeks worked");
            	  int noOfWeeks = Integer.parseInt(input.readLine());
            	  SalariedEmployee Emp1=  new SalariedEmployee(salary,noOfWeeks);
            	  
            	  System.out.println(Emp1.getsalary());
            	 
            	  
              }
              else if(choice==2) {
            	  System.out.println("Salary of employee");
            	  salary = Double.parseDouble(input.readLine());
            	  SalariedEmployee Emp1=  new SalariedEmployee(salary,1);
            	  System.out.println("increment percentage");
            	  int  percentage = Integer.parseInt(input.readLine());
            	  Emp1.setSalary(percentage);
     
            	  
            	  System.out.println("New Salary");
            	  System.out.println(Emp1.getsalary());
            	  
              }
              else {
            	  System.out.println("invalid option !");
              }
        	 
        	
        	break;
        	
        case 2 :
        	System.out.println("What you want to do ? ");
            System.out.println(" 1. Get Salary of employee ");
            System.out.println(" 2. Incement of salary by some percentage");
            choice=Integer.parseInt(input.readLine());
            if(choice==1) {
        	System.out.println(" Hourly Salary of employee");
        	salary = Double.parseDouble(input.readLine());
        	System.out.println(" No of hours worked");
        	int hrs=Integer.parseInt(input.readLine());
        	HourlyEmployee Emp2= new HourlyEmployee(salary,hrs);
        	System.out.println("Salary");
        	System.out.println(Emp2.getsalary());
        	System.exit(0);
            }
            else if(choice==2) {
            	System.out.println(" Hourly Salary of employee");
            	salary = Double.parseDouble(input.readLine());
          	  System.out.println("increment percentage");
          	  int  percentage = Integer.parseInt(input.readLine());
          	HourlyEmployee Emp2= new HourlyEmployee(salary,1);
          	  Emp2.setSalary(percentage);
          	  System.out.println("New Salary");
          	  System.out.println(Emp2.getsalary());
          	System.exit(0);
            }
        	
        case 3 :
        	System.out.println("What you want to do ? ");
            System.out.println(" 1. Get Salary of employee ");
            System.out.println(" 2. Incement of commision by some percentage");
        	System.out.println(" No of sales ");
        	choice=Integer.parseInt(input.readLine());
            if(choice==1) {
            	System.out.println(" sales ");
        	int sales=Integer.parseInt(input.readLine());
        	ComEmployee Emp3= new ComEmployee(sales);
        	System.out.println("Salary");
        	System.out.println(Emp3.getsalary());
        	System.exit(0);
            }
            else if(choice==2) {
            	 System.out.println("increment percentage");
             	  int  percentage = Integer.parseInt(input.readLine());
             	 ComEmployee Emp3= new ComEmployee();
             	 Emp3.setcommision(percentage);
             	  System.out.println("New Salary");
             	  System.out.println(Emp3.getsalary());
             	System.exit(0);
            	
            }
        	
        	
        
        	break;
        default:
        	System.out.println(" Invalid");
        	break;
        	
	
	}
	
}
}