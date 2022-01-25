import java.util.Scanner;


public class area {

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		// TODO Auto-generated method stub
     int side,area,perimeter,length,breadth,area1,perimeter1;
     Scanner sc =new Scanner(System.in);
     System.out.println("enter side of square");
     side=sc.nextInt();
     area=side*side;
     System.out.println("area of the square: "+area );
     perimeter=4*side;
     System.out.println("perimeter of the square: "+perimeter);
     Scanner sc1=new Scanner(System.in);
     System.out.println("enter length value");
     length=sc1.nextInt();
     Scanner sc2=new Scanner(System.in);
     System.out.println("enter breadth value");
     breadth=sc2.nextInt();
     area1=length*breadth;
     System.out.println("area of rectangle:"+area1);
     perimeter1=2*(length+breadth);
     System.out.println("perimeter of the rectangle"+perimeter1);
     }

}
