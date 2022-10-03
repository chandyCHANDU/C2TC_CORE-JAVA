package Assement;

public class SwitchcaseString {

	public static void main(String[] args) {
	String name="te";
		
		switch(name.toLowerCase())
		{
		case "author":
			System.out.println("amith");
			break;
			
		case "team":
			System.out.println("team java full stack");
			break;
			
		case "editor":
			System.out.println("annop & niroop");
			break;
			default:
				System.out.println("invalid entry");
				break;

	}

}
}
