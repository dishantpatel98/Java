package employee;
import java.util.Scanner;
public class Root {

public static void main(String[] args ) {
	
Scanner scan=new Scanner(System.in);
System.out.println("Enter the values");
PermanentEmployee pe=new PermanentEmployee(scan.nextInt(),scan.nextLine()+scan.nextLine(),scan.nextDouble());
	pe.calculateSalary();
pe.print();	
	
}	
	
	
}
