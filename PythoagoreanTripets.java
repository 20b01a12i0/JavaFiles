
public class PythoagoreanTripets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,z;
		System.out.println("pythoagorean triplets are:");
		for(x=0;x<100;x++){
			for(y=0;y<100;y++){
				for(z=0;z<100;z++){
					if(x<z && y<z &&  x<y && x*x+y*y==z*z)
						System.out.print("("+x+","+y+","+z+")");
				}
			}
		}

	}

}
