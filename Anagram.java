
import java.util.Arrays;
import java.util.Scanner;
class AnagramsOrNot{
	String str1;
	String str2;
	public void data(String str1,String str2){
		this.str1=str1;
		this.str2=str2;
	}
		
		public void whetherAnagram(){
			if(str1.length()==str2.length()){
			char[] char1=str1.toCharArray();
			char[] char2=str2.toCharArray();
			Arrays.sort(char1);
			Arrays.sort(char2);
			if(Arrays.equals(char1, char2)){
				System.out.println("both are anagram");
			}
			}
			else{
				System.out.println("both are not anagram");
			}
		}
		
}
public class Anagram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string 1:");
		String str1=new String();
		 str1=sc.next();
		System.out.println("enter string 2:");
		String str2=new String();
		 str2=sc.next();
		AnagramsOrNot a=new AnagramsOrNot();
		a.data(str1,str2);
		a.whetherAnagram();

	}

}
