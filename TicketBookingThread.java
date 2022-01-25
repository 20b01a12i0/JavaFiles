
public class TicketBookingThread extends Thread{
	Tickets ts;
	String uname;
	int nt;
	public TicketBookingThread(Tickets tk,String name,int n){
		ts=tk;
		uname=name;
		nt=n;
	}
	public void run(){
		ts.bookTickets(uname, nt);
	}

}
