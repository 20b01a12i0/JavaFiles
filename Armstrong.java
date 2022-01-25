import java.util.Scanner;

class ArmstrongNum{
	int num;

public void data(int n){
	num=n;
}
public void whetherArmstrong(){
	int num1=num;
	int len=0;
	
	long sum=0;
	while(num1>0){
		num1=num1/10;
		len=len+1;
	}
	int rem=0;
	int num2=num;
	while(num2>0){
		 rem=num2%10;
		sum= (long) (sum+(Math.pow(rem, len)));
		num2=num2/10;
	}
	if(sum==num){
		System.out.println("Entered number is a armstrong number");
	}
	else{
		System.out.println("the entered number is not a armstrong number");
	}
}
}
public class Armstrong {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArmstrongNum am=new ArmstrongNum();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		am.data(n);
		am.whetherArmstrong();

	}

}
