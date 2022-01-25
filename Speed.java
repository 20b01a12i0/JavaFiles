import java.util.Scanner;

class SpeedLimit{
	int speedlimit;
	int clockedspeed;
	public void data(int sl,int cs){
		speedlimit=sl;
		clockedspeed=cs;
	}
	public void caluculate(){
		if(speedlimit<clockedspeed){
			int fine=((clockedspeed-speedlimit)*50)+2000;
			System.out.println("speed was illegal and the fine is"+fine);
		}
		else{
			System.out.println("speed is legal");
		}
	}
}
public class Speed {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpeedLimit speed=new SpeedLimit();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter speed limit");
		int sl=sc.nextInt();
		System.out.println("enter clocked speed");
		int cs=sc.nextInt();
		speed.data(sl,cs);
		speed.caluculate();
		

	}

}
