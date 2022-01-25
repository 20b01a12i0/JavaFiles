import java.util.*;
public class LinkedListOperations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedList ll=new LinkedList();
        //linked list operations
        ll.addFirst("Pranathi");
        ll.add("Leela");
        ll.add("Taranya");
        ll.add(2,"Jothsna");
        ll.addLast("Prasanna");
        ll.addFirst("Harshini");
        ll.removeFirst();
        ll.removeLast();
        ll.remove(2);
    
       Iterator it=ll.iterator();
       while(it.hasNext()){
    	   System.out.println(it.next());
       }
       System.out.println("the last String:"+ll.getLast());
       System.out.println("the first String:"+ll.getFirst());
	}

}
