import java.util.Scanner;

class Classroom{
   String bname;
	
	int roomnumber;
	int people;
	int noofseats;
	int audiovideosystem;
	public void data(String bname,int roomnumber,int noofseats,int people,int audiovideosystem){
		this.bname=bname;
		this.roomnumber=roomnumber;
		this.noofseats=noofseats;
		this.audiovideosystem=audiovideosystem;
		this.people=people;
	}
	public String buildingName(){
		return bname;
	}
	public int roomNumber(){
		return roomnumber;
	}
	public boolean audioVideoSystem(){
		if(audiovideosystem == 0){
			return false;
		}
		else{
			return true;
		}
	}
		public void enteringClass(int num){
			 int rseats=noofseats-people;
			 if(num>rseats){
				 System.out.println(rseats+"are left");
			 }
			 else{
				 System.out.println("students can enter");
			 }
		}
			 public void leavingClass(int num ){
				 int rseats=noofseats-people;
				 if(num > people){
					 System.out.println(people+"are there");
			 }
				 else{
					 System.out.println("students can leave the class");
				 }
		
		}
	}


public class javatask2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter building name:");
	    String bname=new String();
	    bname=sc.next();
	    System.out.println("enter room number:");
	    int roomnumber=sc.nextInt();
	    System.out.println("1.audiovideo is present ,if 0 audiovideo is not present ");
	    int audiovideosystem=sc.nextInt();
	    System.out.println("enter seats  in class:");
	    int noofseats=sc.nextInt();
	    System.out.println("enter no.of students:");
	    int people=sc.nextInt();
	    Classroom c=new Classroom();
	    c.data(bname, roomnumber, noofseats, people, audiovideosystem);
	    
	    

	   while(true){
		   System.out.println("enter ur choice:");
		   System.out.println("1.view building name:");
		   System.out.println("2.view room number:");
		   System.out.println("3.audio video system:");
		   System.out.println("4.no.of students entering class:");
		   System.out.println("5.no.of students leaving class: ");
		   System.out.println("6.exit");
		   int n=sc.nextInt();
		   int num;
		   int rseats=noofseats-people;
		   switch(n){
		   case 1:
			  
			   System.out.println("building name:"+c.buildingName());
			   break;
		   case 2:
			   System.out.println("room number:"+c.roomNumber());
			   break;
		   case 3:
			   if(c.audioVideoSystem()==true){
				   System.out.println("audio video system is present");
				   break;
			   }
			   else{
				   System.out.println("audio video system is not there");
				   break;
			   }
			   
		   case 4:
			   System.out.println("enter no.of students to enter the class:");
			   num=sc.nextInt();
			   c.enteringClass(num);
			   break;
		   case 5:
			   System.out.println("enter no.of students to leave the class:");
			   num=sc.nextInt();
			   c.leavingClass(num);
			   break;
		   }
		   if(n==6){
			   break;
		   }
		   
	   }

	}

}
