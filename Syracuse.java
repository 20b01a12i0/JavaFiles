import java.util.Scanner;

class Hailstone{
	int x;
	public void collatz(int x){
		int i=0;
		 while(x>1){
		      int temp=x;
			if(temp%2==0)
				x=x/2;
			
			else if(temp%2!=0)
				x=(3*x)+1;

		   System.out.print(temp+",");	
			i=i+1;
			
		}
		 System.out.print(x);
	}
	
}
public class Syracuse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hailstone s=new Hailstone();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int x=sc.nextInt();
		s.collatz(x);

	}

}
