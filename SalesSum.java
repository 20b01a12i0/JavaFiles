import java.util.Scanner;

class SumOfSales{
	int arr[][];
	int salesmans;
	int months;
	public void Sales(int arr[][],int m,int n){
		int total=0;
		for(int i=0;i<m;i++){
			int esales=0;
			for(int j=0;j<n;j++){
				esales = esales + arr[i][j];
			}
			System.out.println("total sales for each salesmen for six months:"+esales);
			total=total+esales;
		}
		System.out.println("the grand total is:"+total);
	        
	}
}
public class SalesSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfSales ss=new SumOfSales();
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter no.of sales mans:");
	    int sm=sc.nextInt();
	    System.out.println("enter how many months sales should be caluculate:");
	    int m=sc.nextInt();
	    int arr[][]=new int[sm][m];
	    System.out.println("enter sales amount:");
	    for(int i=0;i<sm;i++){
	    	for(int j=0;j<m;j++){
	    		arr[i][j]=sc.nextInt();
	    	}
	    }
		ss.Sales(arr,sm,m);

	}

}
