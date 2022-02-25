package constructor;

public class cons {

	public static void main(String[] args) {
		
		human hman = new human("Gourob",21,60);
		//Without weight - human hman = new human("Gourob",21);
		//Without weight & Age - human hman = new human("Gourob");
	
		System.out.println("Here are your informations: ");
		System.out.println("Your name is "+hman.name);
		System.out.println("You are "+hman.age+" years old");
		System.out.println("Your weight is "+hman.weight+" kg");
	}
         
}
