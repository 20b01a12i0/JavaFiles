import java.util.Scanner;

class Minutes{
	int year;
	
	
	public void Data(int y){
		year=y;
	}
	public long caluculateMin(){
		
		if(year%4==0){
			return 366 * 24 * 60;
			
		}
		else{
			return 365 * 24 * 60;
		}
	}
	public void min(){
		if(year%4!=0){
			System.out.println("it is leap year having "+caluculateMin()+"minutes");
		}
		else{
			System.out.println("it is a non leap year having "+caluculateMin()+"minutes");
		}
	}
}
public class MinutesInYear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Minutes Min=new Minutes();
		Scanner sc=new Scanner(System.in);
		System.out.println("year:");
		int y=sc.nextInt();
		Min.Data(y);
		Min.min();
		

	}

}
