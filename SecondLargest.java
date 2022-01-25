import java.util.Scanner;
class Slargest{
	 int m;
	 int arr[];

public void slargest(int arr[],int m){
		int max=0,smax = 0;
		if(arr[0]>arr[1]){
			max=arr[0];
			smax=arr[1];
		}
		else{
			max=arr[1];
			smax=arr[0];
		}
		 for(int i=2;i<m;i++){
			      
		           if(arr[i]>max){
		        	   smax=max;
		        	   max=arr[i];
		           }
		           else if(arr[i]>smax){
		        	   smax=arr[i];
		        	   
		           }
		 }
            int temp=smax;
            for(int i=0;i<m;i++){
        	if(arr[i]==temp){
        		int position=i;
        		System.out.println("the position of second largest element in arry:" + position);
        	}
        
		
		 }
		 
}


    
	}
public class SecondLargest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Slargest sl=new Slargest();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no.of elements in array");
		int m=sc.nextInt();
		int arr[]=new int[m];
		System.out.println("enter array elements:");
		for(int i=0;i<m;i++){
		  arr[i]=sc.nextInt();
		}
		sl.slargest(arr,m);
		
		

}
}