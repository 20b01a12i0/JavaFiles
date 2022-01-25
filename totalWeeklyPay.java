import java.util.Scanner;
class WeeklyPay{
	int hwage;
	int reghrs;
	int tovertimehrs;
	public void Data(int h,int r,int t){
		hwage=h;
		reghrs=r;
		tovertimehrs=t;
	}
	public int Pay(){
		return (int) ((7 * hwage * reghrs)+(tovertimehrs*1.5*hwage));
		}
	public void displayData(){
		System.out.println("total weekly pay :"+Pay());
	}
}
public class totalWeeklyPay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WeeklyPay emp=new WeeklyPay();
		Scanner sc=new Scanner(System.in);
		System.out.println("hourly wages:");
		int h=sc.nextInt();
		System.out.println("regular hours for a worker:");
		int r=sc.nextInt();
		System.out.println("total over time hours done by worker:");
		int t=sc.nextInt();
		emp.Data(h,r,t);
		emp.displayData();

	}

}
