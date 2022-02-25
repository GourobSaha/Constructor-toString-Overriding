
package constructor;
import java.util.Scanner;
public class tostring_override {
	
	 Scanner sc = new Scanner(System.in);
	 String make;
	 String model;
	 String color;
	 int year;
	
	 public String toString() {
		 
		 System.out.println("Insert the name of your car company: ");
		 make = sc.next();
		 System.out.println("Insert the model of your car: ");
		 model = sc.next();
		 System.out.println("Insert the color of your car: ");
		 color = sc.next();
		 System.out.println("Insert the model year of your car: ");
		 year = sc.nextInt();
		 
		 return make+"\n"+model+"\n"+color+"\n"+year;
	 }

}
