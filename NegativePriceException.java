
public class NegativePriceException extends Exception{
	public NegativePriceException(String msg){
		super(msg);
	}
	public String toString(){
		return this.getMessage();
	}


}
