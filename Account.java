package Practice1;
import java.util.*;

public class Account {

public static int random=0;	
private String name;
private double balance;
private  int accno;
public Account() {
	
	balance=0; 
	
}
	
public void deposit(double amount) {
balance=balance+amount;	
	}
public void withdraw(double amount) {
	balance=balance-amount;
	}

public void show() {
	System.out.println("Account number is"+accno);
	System.out.println("name is"+ name);
	System.out.println("balance is"+balance);
	
}

public void createNewAccount() {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter your name");
	name =scan.next();
	System.out.println("Enter the openning balance");
	balance=scan.nextDouble();
  	accno=random++;
	
}


	
}
