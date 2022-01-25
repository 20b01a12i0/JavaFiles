
public class Tickets {
	int tickets=7;
	public synchronized void bookTickets(String uname,int wantedtickets){
		if(wantedtickets <= tickets){
			tickets = tickets - wantedtickets;
			System.out.println(wantedtickets + " are booked succesfully to " +uname);
		}
		else{
			System.out.println("not available");
		}
	}

}
