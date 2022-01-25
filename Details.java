class Emp{
	static String ceo;
	public void show(){
		System.out.println(ceo);
	}
}
public class Details {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Emp e1=new Emp();
       Emp e2=new Emp();
       e1.ceo="abcde";
       e1.show();
       e2.show();
       
       
	}

}
