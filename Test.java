package Practice1;
import java.util.*;

public class Test {

public static void main(String [] arg) {
	int cnt=0;
Scanner scan=new Scanner(System.in);
Account[] a1=new Account[10];
for(int i=0;i<a1.length;i++) {
	a1[i]=new Account();
	}

while(true) {
	System.out.println("1.Add Account");
	System.out.println("2.Display");
	System.out.println("3.Deposite");
	System.out.println("4.Withdraw");
	System.out.println("5.Exit");	
	
	int choice =scan.nextInt();
	switch (choice) {
	case 1:
		a1[cnt++].createNewAccount();
		break;
	case 2:
		for(int i=0;i<cnt;i++){
			a1[i].show();
			}
		break;
	case 3:
		
		System.out.println("Enter the account number in which you want to deposit");
		int a=scan.nextInt();
		System.out.println("Enter the amount you want to deposit");
		double a2=scan.nextDouble();
		a1[a].deposit(a2);
		break;
	case 4:
		System.out.println("Enter the account number from which you want to withdraw");
		int a3=scan.nextInt();
		System.out.println("Enter the amount you want to withdraw");
		double a4=scan.nextDouble();
		a1[a3].withdraw(a4);
		break;
	case 5:
		System.exit(0);
		}
	
	
	
	}
	
	
}




}

	
	
	

