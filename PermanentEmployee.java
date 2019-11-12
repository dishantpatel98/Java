package employee;

public class PermanentEmployee extends Employee{

double bsal;
double hra;
double da;


public PermanentEmployee(int id,String name,double bsal){
		super(id,name);
	   this.bsal=bsal;
	
	}
public  void calculateSalary() {
	this.hra=(0.18)*(this.bsal);
	this.da=(0.20)*(this.bsal);
	totalSalary=this.bsal+this.hra+this.da;
	
	
}
void print() {
	
	
	System.out.println("Total salary is"+totalSalary);
}
	
	
	
}
