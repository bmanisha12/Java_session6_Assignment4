import java.util.Scanner;

abstract class resultsys
{
	int roll,reg_id;
	String name;
	
}
class stud_data extends resultsys
{
	void get()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("\n enter name of student: ");
		name = s.next();
		System.out.println("\n enter roll number: ");
		roll = s.nextInt();
		System.out.println("\n enter registration id: ");
		reg_id= s.nextInt();
	}
	
	void display()
	{
		System.out.println("\n Student name: "+name+ "\n roll number: "+roll+"\n registeration id: "+reg_id );
	}
}
public class maincls {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stud_data sd = new stud_data();
		sd.get();
		sd.display();

	}

}
