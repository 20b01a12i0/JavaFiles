import java.util.Scanner;

class ArraySum{
	int arr[];
	int n;
public void Sum(int arr[],int n){
	System.out.println("array summation:");
	for(int i=0;i<n;i++){
		int sum=0;
		for(int j=0;j<n;j++){
			if(i==arr[j]%10){
				sum=sum+arr[j];
			}
		}
		System.out.print(sum + " ");
	}
	
					  
	
	}
}
public class SummationArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraySum as=new ArraySum();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter array elements:");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
        as.Sum(arr,n);
	}

}
