import java.util.*;
public class WordFrequency {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
	     StringTokenizer str=new StringTokenizer(input," ");
	     while(str.hasMoreTokens()){
	    	 al.add(str.nextToken());
	     }
	 	HashMap<String,Integer> hm=new HashMap<String,Integer>();
		for(int i=0;i<al.size();i++){
			if(hm.containsKey(al.get(i))){
				int count=hm.get(al.get(i));
				hm.put((String) al.get(i), count+1);
			}
			else{
				hm.put((String)al.get(i), 1);
			}
			
			}
		   System.out.println(hm);
		 
	}
	
}





