import java.util.Scanner;

class Saddle{
	int m,n;
	int arr[][];
	public void findSaddlePoint(int arr[][],int m,int n){
		int flag=0;
		for(int i=0;i<m;i++){
			int min=arr[i][0];
			int col=0;
			for(int j=0;j<n;j++){
				if(min>arr[i][j]){
					min=arr[i][j];
					col=j;
					}
			}
			int max=0;
			for(int k=0;k<m;k++){
				if(max<arr[k][col]){
					max=arr[k][col];
				}
			}
			if(max==min){
				System.out.println("saddle point for a given matrix is:"+max);
				flag=1;
			}
		}
		if(flag==0){
			System.out.println("there are no saddle points");
		}
	}
}
	
		public class SaddlePoint {
		
		

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Saddle s=new Saddle();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.of rows:");
		int n=sc.nextInt();
		System.out.println("enter no.of col:");
		int m=sc.nextInt();
		int arr[][]=new int[m][n];
		System.out.println("enter the elements:");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		s.findSaddlePoint(arr, m, n);

	}

}
