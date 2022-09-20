package assignments;

public class studentdetails {
	int rollno;
	String name;
	float fee;
	
studentdetails(int rollno,String name,float fee)
{
this.rollno=rollno;
this.name=name;
this.fee=fee;
}
void display()
{
	System.out.println(rollno+"" +name+"" +fee);
}
class Testthis
{
	public static void main(String[] args) {
		studentdetails s1=new studentdetails(111,"anoop",10000f);
		studentdetails s2=new studentdetails(222,"niroop",20000f);
		s1.display();
		s2.display();
	}
		// TODO Auto-generated method stub

	}

}
