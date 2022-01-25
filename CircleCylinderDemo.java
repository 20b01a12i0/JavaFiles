public class CircleCylinderDemo {


	public static void main(String[] args) {
		Cylinder c=new Cylinder();
		c.setRadius(7.5);
		c.setColor("pink");
		c.setheight(9);
		System.out.println("volume of the cylinder:"+c.volume());
		System.out.println("area of the circle:"+c.getArea());

		System.out.println(c);

	}

}
