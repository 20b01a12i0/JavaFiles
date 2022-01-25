public class Cylinder extends Circle{
	private double height;
	public Cylinder(double radius , String color,double height ){
		super(radius,color);
		this.height=height;
	}
	public Cylinder(){
		super();
		this.height=0;
	}
	
	public double getHeight() {
		return height;
	}

	public void setheight(double height) {
		
		this.height = height;
	}
	public double volume(){
		return (3.14*this.getRadius()*this.getRadius()*height);
		}
	public String toString(){
		
		String output1=" cylinder [radius: "+this.getRadius()+ " color: "+ this.getColor()+ " height:" +height + "]";
		return output1 ;
		
		
	}
	
}