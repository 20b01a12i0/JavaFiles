import java.util.*;
public class Two20DigitsNumbersAdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter str value");
		String str=sc.next();
		System.out.println("enter str value:");
		String str1=sc.next();
		ArrayList al=new ArrayList();
		ArrayList al1=new ArrayList();
		ArrayList output=new ArrayList();
		for(int i=str.length()-1;i>=0;i--){
			al.add(str.charAt(i)+"");
		}
		for(int i=str1.length()-1;i>=0;i--){
			al1.add(str1.charAt(i)+"");
		}
		for(int k=0;k<al.size();k++){
             int a=Integer.parseInt((String) al.get(k));
             int b=Integer.parseInt((String) al1.get(k));
             int c=a+b;
             if(c>9 && k!=al.size()-1){
            	 int unitsdigit=c%10;
            	 int tensdigit=c/10;
            	 int cs=Integer.parseInt(al.get(k+1).toString())+tensdigit;
            	 al.set(k+1, cs+"");
            	 output.add(k,unitsdigit+"");
             }
             else{
            	 output.add(k,c+"");
             }
		}
		System.out.println("Addition of 20 digit numbers");
		for(int i=output.size()-1;i>=0;i--){
			System.out.print(output.get(i).toString());
		}
		

	}

}
