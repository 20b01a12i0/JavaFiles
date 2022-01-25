import java.util.Scanner;


public class ArraySum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n;
		System.out.println("enter size of array");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter elements");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++){
			sum=sum+arr[i];
		}
		System.out.println("sum:"+sum);

	}

}
