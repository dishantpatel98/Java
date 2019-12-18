import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class test2{ 
	public static void main(String[] args) {
	
	List<Listdemo> list=new ArrayList<Listdemo>();
	int cnt=0;
	while(true) {
		Scanner scan =new Scanner(System.in);
		System.out.println("1. Insert Account");
		System.out.println("2. Update");
		System.out.println("3. Display");
		System.out.println("4. Deposit");
		System.out.println("5. withdraw");
		System.out.println("Eter your choise");
		int choice=scan.nextInt();
		
		switch(choice) {
		case 1:
				Listdemo a1=new Listdemo();
				a1.createNewAccount();
				list.add(a1);
				cnt++;
				break;
		                
		case 2:
			System.out.println("enter the account number you want to update");
			int id=scan.nextInt();
				for(Listdemo d1:list) {
					if(d1.getId()==id) {
						d1.createNewAccount();
					}
				}
				break;
				
		case 3:
              for(Listdemo d:list) {
                d.show(); 
                
            	                   }			
		       break;
		
		case 4:
			System.out.println("Enter the account number you want deposit");
			int id3=scan.nextInt();
			for(Listdemo d5:list ) {
				if(d5.getId()==id3) {
					System.out.println("Enter the amount you want to deposit");
					double am=scan.nextDouble();
				    d5.deposit(am);
				}
				
				                  }
			break;
		case 5:
			System.out.println("Enter the account number you want withdraw");
			int id4=scan.nextInt();
			for(Listdemo d5:list ) {
				if(d5.getId()==id4) {
					System.out.println("Enter the amount you want to withdraw");
					double am2=scan.nextDouble();
				    d5.withdraw(am2);
				}
				break;
		       
		       
	}
	
	}	
}
}}