import java.util.Scanner;


public class ExceptionHandling {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		int d[]=new int[3];
		String str;
		String str1="abc";
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER a,b values");
		a=sc.nextInt();
		b=sc.nextInt();
		try{
			c=a/b;
			d[5]=a/b;
			int x=Integer.parseInt(str1);
			System.out.println(x);
			System.out.println(c);
			System.out.println("division"+d[5]);
			
			}
		catch(ArithmeticException ae){
			System.out.println("Arithmetic exception");
		}
		catch(NumberFormatException nf){
			System.out.println("NumberFormatException");
			
		}
		catch(ArrayIndexOutOfBoundsException ai){
			System.out.println("Array Index Out Of Bounds Exceptioon");
		}
		

	}

}
