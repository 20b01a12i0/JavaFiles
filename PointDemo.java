
public class PointDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Point3D _3D=new Point3D();
         _3D.setXY(5,6);
         _3D.setXYZ(2, 9, 4);
         System.out.println("x "+_3D.getX());
         System.out.println("y "+ _3D.getY());
         System.out.println("z "+_3D.getZ());
         System.out.println(_3D);
	}

}
