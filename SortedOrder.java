import java.util.*;

 class SortedOrder {
	
	public void  sort(ArrayList as){
		TreeSet ts=new TreeSet();
		Iterator it=as.iterator();
		while(it.hasNext()){
			ts.add(it.next());
		}
		System.out.println(ts);	
}
}