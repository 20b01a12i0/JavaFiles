import java.util.Scanner;

class factor{
	int num1,num2;
	public void getNumbers(int x,int y){
		num1=x;
		num2=y;
	}
	public void isFactor(){
		if(num2%num1==0){
			System.out.println("True");
			System.out.println("first argument is factor of second argument");
		}
		else{
			System.out.println("False");
			System.out.println("First argument is not a factor of second argument");
		}
	}
}
public class factors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number1");
		int x=sc.nextInt();
		System.out.println("enter number2");
		int y=sc.nextInt();
		factor f=new factor();
		f.getNumbers(x,y);
		f.isFactor();

	}

}
