import java.util.Scanner;

class age1{
	int age;
	public void data(int a){
		age=a;
	}
	public void uptoage(){
		if(age%2==0){
			for (int i=2;i<=age;i=i+2){
				
				System.out.print(i+" ");
			}
		
		}
		else{
			for (int i=1;i<=age;i=i+2){
				System.out.println(i);
			}
		}
	}
}
public class age {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		age1 oage=new age1();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		int a=sc.nextInt();
		oage.data(a);
		oage.uptoage();
		

	}

}
