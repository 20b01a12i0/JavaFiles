
public class ThreadSychronization {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tickets tc = new Tickets();
		TicketBookingThread t1=new TicketBookingThread(tc,"pranathi",2);
		TicketBookingThread t2=new TicketBookingThread(tc,"taranya",3);
		TicketBookingThread t3=new TicketBookingThread(tc,"harshini",4);
		t1.start();
		t2.start();
		t3.start();



	}

}
