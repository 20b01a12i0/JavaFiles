import java.util.*;
public class Sorted {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList as=new ArrayList();
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		StringTokenizer st= new StringTokenizer(input,",");
		while(st.hasMoreTokens()){
			String name=st.nextToken();
			as.add(name);
		}
      SortedOrder so=new SortedOrder();
      so.sort(as);
  
	}

}
