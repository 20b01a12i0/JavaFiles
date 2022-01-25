
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerMaxMin {
	
 public static void main(String[] args)
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter coma seperated list of values:");
  String input=sc.nextLine();
  StringTokenizer st=new StringTokenizer(input,",");
  int max=Integer.MIN_VALUE;
  int min=Integer.MAX_VALUE;
  int temp;
  while(st.hasMoreTokens())
  {
   String value=st.nextToken();
   int num=Integer.parseInt(value);
   if(num<min)
   {
    temp=min;
    min=num;
    num=temp; 
   }
   else if(num>max)
   {
    temp=max;
    max=num;
    num=temp;
   }
    
  }
  System.out.println("Maximum Value:"+max);
  System.out.println("Minimum Value:"+min);
 }

}

