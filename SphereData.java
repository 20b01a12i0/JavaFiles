import java.util.Scanner;
class sphere{
	 double radius;
     public void getRadius(double r){
	         radius=r;
     }
     public double diameter(){
	          return 2 * radius;
     }
     public double caluculateCf(){
	         return (float) (2 * 3.14 * radius);
     }
     public double surfaceArea(){
    	    return  (4 * 3.14 * radius *radius);
     }
     public double volume(){
    	 return ((4/3)*3.14*radius*radius);
     }
     public void displayData(){
    	 System.out.println("diameter of sphere"+ diameter());
    	 System.out.println("circumference of sphere:"+caluculateCf());
    	 System.out.println("Total surface area of sphere"+surfaceArea());
    	 System.out.println("volume of sphere:"+volume());
     }
}
public class SphereData {
      public static void main(String[] args) {
            sphere sp=new sphere();
            Scanner sc=new Scanner(System.in);
		    System.out.println("enter radius:");
		    double r=sc.nextInt();
		    sp.getRadius(r);
		    sp.displayData();
          
    }
}
