import java.util.Scanner;

class Person{
	String firstname;
	String lastname;
	String surname;
	

public Person() {
		// TODO Auto-generated constructor stub
	firstname=" ";
	lastname=" ";
	surname=" ";
	}
public Person(String fname) {
	// TODO Auto-generated constructor stub
	firstname=fname;
	lastname=" ";
	surname=" ";
}
public Person(String fname, String lname) {
	// TODO Auto-generated constructor stub
	firstname=fname;
	lastname=lname;
	surname=" ";
}
public Person(String fname, String lname, String sname) {
	// TODO Auto-generated constructor stub
	firstname=fname;
	lastname=lname;
	surname=sname;
}

public void display(){
	System.out.println(firstname+" "+lastname+" "+surname);
}
}
public class ConstructorOverloading {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first name:");
		String fname=sc.next();
		System.out.println("enter last name:");
		String lname=sc.next();
		System.out.println("enter surname:");
		String sname=sc.next();
		Person p=new Person();
		Person p1=new Person(fname);
		Person p2=new Person(fname,lname);
		Person p3=new Person(fname,lname,sname);
		p.display();
		p1.display();
		p2.display();
		p3.display();


	}

}
