import java.util.Scanner;
public class StringPalidrom {
public static void main(String[] args) {
 String strInput = "nayan";

 StringBuffer sb = new StringBuffer(strInput);
 sb.reverse();
 String revstr = sb.toString();
 if(strInput.equals(revstr))
 {
 System.out.println(strInput + " string is palindrome.");
 }
 else
 {
 System.out.println(strInput + " string is not palindrome.");
 }
}
}
