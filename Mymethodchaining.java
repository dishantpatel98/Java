package MethodChaining;

public class Mymethodchaining {
private String name;
private int age ;

/*
without method chaining 

public void setName(String name) {
	this.name=name;
	System.out.println("Name is:"+name);
	}
public void setAge(int age) {
	
	this.age=age;
	System.out.println("Age is:"+age);
	}

	public void introduce() {
		
		System.out.println("Hello");
	}
	
 */

public Mymethodchaining setName(String name) {
	this.name=name;
	System.out.println("Name is:"+name);
	return this;
}
public Mymethodchaining setAge(int age) {
	
	this.age=age;
	System.out.println("Age is:"+age);
return this;	
}

	public void introduce() {
		
		System.out.println("Hello");
	}
	
}
