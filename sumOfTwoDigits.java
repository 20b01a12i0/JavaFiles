import java.util.Scanner;

class sum{
	int num1;
	public void data(int x){
		num1=x;
	}
	public void numbersSum(){
	     int end=num1%10;
			num1=num1/10;
		 int middle=num1%10;
		 num1=num1/10;
		 int start=num1;
		if(middle==end+start){
			System.out.println("middle digit is equals to the sum of the other two digits");
		}
		else{
			System.out.println("invalid number");
		}
	}
}
public class sumOfTwoDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sum osum=new sum();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three digit integer");
		int x=sc.nextInt();
		osum.data(x);
		osum.numbersSum();

	}

}
