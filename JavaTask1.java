import java.util.Scanner;

class ScoreCard{
	String teamname;
	String player1name;
	String player2name;
	int player1points=0;
	int player2points=0;
	public void data(String teamname,String playe1rname,String player2name){
	   teamname=teamname;
	   player1name=player1name;
	   player2name=player2name;
	}
	public int scorePoints(String playername,int playerpoints){
		if(playername.equals(player1name)){
			player1points=player1points+playerpoints;
			return player1points;
		}
		else{
			return player2points+=playerpoints;
		}
	}
	public int getPoints(String playername){
		if(playername.equals(player1name)){
			return player1points;
		}
		else{
			return player2points;
		}
	}
	public int getTotalPoints(){
		return player1points+player2points;
	}
	public void printSummary(){
		System.out.println(teamname+":"+(player1points+player2points));
	}
	
}
public class JavaTask1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScoreCard t1=new ScoreCard();
		System.out.println("enter team name:");
		Scanner sc=new Scanner(System.in);
		String teamname=sc.next();
      System.out.println("enter player1 name:");
      String player1name=sc.next();
      System.out.println("enter pplayer2 name:");
      String player2name=sc.next();
      t1.data(teamname, player1name, player2name);
      String player;
      int score;
      while(true){
    	  System.out.println("enter your choice:");
    	  System.out.println("1.scorePoints");
    	  System.out.println("2.getPoints");
    	  System.out.println("3.getTotalPoints:");
    	  System.out.println("4.printSummary");
    	  System.out.println("5.exit");
    	  int num=sc.nextInt();
    	  switch(num){
    	  case 1:
    		  System.out.println("enter player name:");
    		  player=sc.next();
    		  System.out.println("enter score");
    		  score=sc.nextInt();
    		  t1.scorePoints(player, score);
    		  break;
    	  case 2:
    		  System.out.println("enter player name:");
    		  player=sc.next();
    		  System.out.println("player score:"+t1.getPoints(player));
    		  break;
    	  case 3:
    		  System.out.println("Total score :"+t1.getTotalPoints());
    		  break;
    	  case 4:
    		  System.out.println("Score card:");
    		  System.out.println(teamname+":"+t1.getTotalPoints());
    		  break;
    	  }
    	  if(num==5)
    		  break;
      }
	}

}
