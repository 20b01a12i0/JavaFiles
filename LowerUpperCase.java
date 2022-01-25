import java.util.Scanner;

class CaseConverting{
	String str1;
	public void Converting(String str1){
		char[] chars=str1.toCharArray();
		for(int i=0;i<str1.length();i++){
			Character char1=chars[i];
			if(Character.isLowerCase(char1)){
				chars[i]=Character.toUpperCase(char1);
				
			}
			else{
				chars[i]=Character.toLowerCase(char1);
				
			}
		}
		System.out.println(chars);
		
}
}
public class LowerUpperCase {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("enter a string");
		String str1=new String();
		str1=sc.nextLine();
		CaseConverting c=new CaseConverting();
		c.Converting(str1);

	}

}
