class ObjectsCount{
	static  int count=0;
	public static void countingObjects(){
		count++;
	}
	public static void noOfObjects(){
		System.out.println("no.of objects:"+count);
	}
	
}
public class NoOfObjects {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectsCount o1=new ObjectsCount();
		o1.countingObjects();
	    ObjectsCount o2=new ObjectsCount();
    	o2.countingObjects();
        ObjectsCount o3=new ObjectsCount();
		o3.countingObjects();
        ObjectsCount o4=new ObjectsCount();
		o4.countingObjects();
		ObjectsCount o5=new ObjectsCount();
		o5.countingObjects();
		o5.noOfObjects();
		
	}

}
