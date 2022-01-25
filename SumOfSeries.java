import java.util.Scanner;

class Series{
	int num;
	public void data(int n){
		num=n;
	}
	public void seriesSum(){
		
		double i=1;
		double j=2;
		float sum=0;
	
		for(i=1; i<=num+2  ;i=i+2,j=j+2){
			sum=(float) (sum+(i/j));
		}
		System.out.println("sum of the series"+sum);
	}
}
public class SumOfSeries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Series s=new Series();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of terms:");
		int n=sc.nextInt();
		s.data(n);
		s.seriesSum();

	}

}
