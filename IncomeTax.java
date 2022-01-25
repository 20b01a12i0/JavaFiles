import java.util.Scanner;

class TaxIncome{
	long investment;
	long insurance;
	long hra;
	long medical;
	long gincome;
	public void getData(long i,long in,long h,long m,long g){
		investment=i;
		insurance=in;
		hra=h;
		medical=m;
		gincome=g;
	}
	public long TaxIncome(){
		return (gincome-(investment+insurance+hra+medical+150000));
	}
	public void IncomeTax(){
		if(TaxIncome()>0){
			if(gincome<=500000){
				double IncomeTax= (TaxIncome()*.1);
				System.out.println(("Income:"+IncomeTax));
			}
			if ((gincome<=1000000) & (gincome>500000)){
				double IncomeTax=25000+((gincome-500000)*0.2);
                System.out.println(("Income:"+IncomeTax));
			}
			if(gincome>1000000){
				double IncomeTax=75000+((gincome-1000000)*0.3);
				System.out.println(("Income:"+IncomeTax));
			}
		}
		else{
			System.out.println("No Income Tax");
		}
	}
	
}
public class IncomeTax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaxIncome Tx=new TaxIncome();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 80c:");
		long i=sc.nextInt();
		System.out.println("enter 80cc:");
		long in=sc.nextLong();

		System.out.println("enter hra");
		long hra=sc.nextLong();

		System.out.println("enter medical:");
		long medical=sc.nextLong();


		System.out.println("enter gincome:");
		long gincome=sc.nextLong();
		Tx.getData(i,in,hra,medical,gincome);
		Tx.IncomeTax();



	}

}
