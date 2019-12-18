package Example3;
import java.util.*;
public class test3 {
public static void main(String[] args){
ArrayList<ImplementDrawable> list=new ArrayList<ImplementDrawable>();
Scanner scan =new Scanner(System.in);
System.out.println("Enter the number of object you want to create");
	int n= scan.nextInt();
	for(int i=0;i<n;i++){
		ImplementDrawable d1=new ImplementDrawable();
		list.add(d1);
	     }
	for(Drawable d:list) {
	d.draw();
		
		
	}
	

}
	
	
	
}
