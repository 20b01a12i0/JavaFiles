import java.util.Scanner;


public class discount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double amount,discount,remaining;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount");
		amount=sc.nextInt();
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter discount");
		discount=sc1.nextInt();
		remaining=amount-(amount*(discount/100));
		System.out.println("remaining amount to pay"+remaining);
		


	}

}
