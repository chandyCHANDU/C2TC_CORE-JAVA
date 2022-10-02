package Assement;

public class Jvastringquiz5 {

	public static void main(String[] args) {
		System.out.println("Java" == new String("Java"));
		String s1="Java";
		String s2= new String("Java");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode()==s2.hashCode());

	}

}
