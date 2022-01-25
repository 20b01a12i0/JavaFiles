
class Circle{
	private double radius;
	private String color;
	public Circle(double rdaius,String color){
		this.radius=radius;
		this.color=color;
	}
	public Circle(){
		this.radius=0;
		this.color=" ";
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getArea(){
		return (3.14*radius*radius);
	}
	public String toString(){
		String output= " circle [radius: "+this.getRadius()+ " color: "+ this.getColor()+"]";
		return output;
		
	}
}
