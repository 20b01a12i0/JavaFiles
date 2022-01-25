import java.util.Scanner;


public class circle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int radius;
		double pi=3.14,area;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter radius of circle");
		radius=sc.nextInt();
		area=(pi * radius);
		System.out.println("area of circle "+area);

	}

}
