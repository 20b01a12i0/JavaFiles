import java.util.Random;


 class RandomThread extends Thread{
	
	public void run(){
		Random random = new Random();  
		for(int i=0;i<=50;i++){
		  int x = random.nextInt(50); 
		System.out.println(x);
	}

	}
}
