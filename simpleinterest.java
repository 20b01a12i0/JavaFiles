import java.util.Scanner;


public class simpleinterest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double p,t,r,simpleinterest;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount:");
		p=sc.nextInt();
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter time");
		t=sc1.nextInt();
		Scanner sc2=new Scanner(System.in);
		System.out.println("enter rate of interest");
		r=sc2.nextInt();
		simpleinterest=p*t*r;
		System.out.println("simple interest "+simpleinterest);
		
	}

}
