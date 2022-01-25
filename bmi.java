import java.util.Scanner;

class bmiData{
	double weight;
	double height;
	public void Data(double w,double h){
		weight=w;
		height=h;
	}
	public double calculateBmi(){
		return (weight*720)/(height*height);
	}
	public void displayData(){
		if(calculateBmi()>=19 & calculateBmi()<=25){
			System.out.println("Healthy person");
		}
		else if(calculateBmi()<19){
			System.out.println("Weak person");
		}
		else{
			System.out.println("obesity");
		}
	}
	
}
public class bmi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		bmiData obmi=new bmiData();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter weight of the persons in pouds:");
		double w=sc.nextInt();
		System.out.println("enter height of a person in inches");
		double h=sc.nextInt();
		obmi.Data(w,h);
		obmi.displayData();
		

	}

}
