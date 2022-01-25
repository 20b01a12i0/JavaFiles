
public class NegativePagesException extends Exception{
	public NegativePagesException(String msg){
		super(msg);
	}
	public String toString(){
		return this.getMessage();
	}

}
