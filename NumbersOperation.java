import java.util.Scanner;

class Operation{
	int num1,num2;
	int ch;
	public void data(int x,int y,int c){
		num1=x;
		num2=y;
		ch=c;
		
	}
	public void caluculate(){
		
		
		switch(ch){
		case 1:
			int sum=num1+num2;
			System.out.println("sum of the number"+sum);
			break;
		case 2:
			int sub=num1-num2;
			System.out.println("difference between two numbers"+sub);
			break;
		case 3:
			int mul=num1*num2;
			System.out.println("multiplication of two numbers"+mul);
			break;
		case 4:
			float div=num1/num2;
			System.out.println("division of two numbers"+div);
			break;
		default :
			System.out.println("enter valid operater");
		}
	}
}
public class NumbersOperation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation op= new Operation();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num1");
		int x=sc.nextInt();
		System.out.println("enter num2");
		int y=sc.nextInt();
		System.out.println("enter operator");
		int c = sc.nextInt();
		op.data(x,y,c);
		op.caluculate();

	}

}
