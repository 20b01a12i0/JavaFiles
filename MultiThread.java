
public  class MultiThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NaturalNumbersThread nt=new NaturalNumbersThread();
		EvenThread et=new EvenThread();
		OddThread  ot=new OddThread();
		RandomThread rt=new RandomThread();
		nt.start();
		et.start();
		ot.start();
		rt.start();
		

	}

}
