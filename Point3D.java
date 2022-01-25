
public class Point3D  extends Point2D{
	private int z;
	public Point3D(int x,int y,int z){
		super(x,y);
		this.z=z;
	}
	public Point3D(){
		super();
		this.z=0;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public void setXYZ(int x,int y,int z){
		setXY(x,y);
		this.z=z;
	}
	public int[] getXYZ(){
		int xyz[] ={this.getX(),this.getY(),this.z};
		return xyz;
	}
	public String toString(){
		return "("+getX()+","+getY()+","+z+")";
		
	}

}
