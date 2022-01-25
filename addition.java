import java.io.InputStream;
import java.util.Scanner;



public class addition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d,e;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		a=sc.nextInt();
		System.out.println("enter b value");
		b=sc.nextInt();
		c=a+b;
		System.out.println("addition:"+c);
        d=a-b;
        System.out.println("subtraction:"+d);
       
        e=a/b;
        System.out.println("division:"+e);
	}

}
