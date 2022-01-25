
import java.io.*;
import java.util.*;

public class Solution {
   

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         String str1=new String("engineering");
         String str2=new String();
    
        for(int i=0;i<str1.length();i++){
            Boolean s=false;
            for(int j=0;j<str2.length();j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    s=true;
                    break;
                }
            }
            if(s==false){
            	str2=str2.concat(String.valueOf(str1.charAt(i)));
            }
           
        }
        System.out.println(str2);
        
    }
}