
interface MotorBike
{
int speed=70;
public void totalDistance();
}
interface Cycle
{
int distance=1000;
public void speed();
}
 class TwoWheeler implements MotorBike,Cycle
{
int totalDistance;
int avgSpeed;
public void totalDistance()
{
totalDistance=speed*distance;
System.out.println("Total Distance Travelled : "+totalDistance);
}
public void speed()
{
int avgSpeed=totalDistance/speed;
System.out.println("Average Speed maintained : "+avgSpeed);
}
}

public  class TwoWheelerDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoWheeler t1=new TwoWheeler();
		t1.totalDistance();
		t1.speed();

	}

}
