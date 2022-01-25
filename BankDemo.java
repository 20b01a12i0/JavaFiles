 abstract class Bank{
	long money;
	public Bank(long money){
		this.money=money;
	}
	public abstract void getBalence();
}
class BankA extends Bank{
	
	public BankA(long money) {
		super(money);
		// TODO Auto-generated constructor stub
	}

	public void getBalence(){
		
		System.out.println("deposied amount in BankA:"+money);
	}


}
class BankB extends BankA{
	public BankB(long money) {
		super(money);
		// TODO Auto-generated constructor stub
	}

	public void getBalence(){
		System.out.println("deposited amount in BankB:"+money);
	}
}
class BankC extends BankB{
	public BankC(long money) {
		super(money);
		// TODO Auto-generated constructor stub
	}

	public void getBalence(){
		System.out.println("deposited amount in BankC:"+money);
	}
}
public class BankDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankA ba =new BankA(100);
		BankB bb=new BankB(200);
		BankC bc=new BankC(300);
		ba.getBalence();
		bb.getBalence();
		bc.getBalence();

	}

}
