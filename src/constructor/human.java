package constructor;

public class human {
     
	String name;
	int age;
	double weight;
	
	human(String name){
		this.name=name;
		
	}
	
	human(String name, int age){
		this.name=name;
		this.age=age;
		
	}
	
	human(String name, int age, double weight){
		this.name=name;
		this.age=age;
		this.weight=weight;
	}
	
	
}
