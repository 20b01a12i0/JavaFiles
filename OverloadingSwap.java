import java.util.Scanner;

class Swap{
	int inum1,inum2,iswap;
	float fnum1,fnum2,fswap;
	double dnum1,dnum2,dswap;
	String Sstr1,Sstr2,Sswap;
	
	public void swap(int inum1,int inum2){
		iswap=inum2;
		inum2=inum1;
		inum1=iswap;
		System.out.println("swapping of integers:"+inum1+" "+inum2);
		
	}
	public void swap(float fnum1,float fnum2){
		fswap=fnum2;
		fnum2=fnum1;
		fnum1=fswap;
		System.out.println("swapping of floats:"+fnum1+" "+fnum2);
		
	}
	public void swap(double dnum1,double dnum2){
		dswap=dnum2;
		dnum2=dnum1;
		dnum1=dswap;
		System.out.println("swapping of doubles:"+dnum1+" "+dnum2);
		
	}
	public void swap(String Sstr1,String Sstr2){
		Sswap=Sstr2;
		Sstr2=Sstr1;
		Sstr1=Sswap;
		System.out.println("swapping of strings:"+Sstr1+" "+Sstr2);
		
	}
}
public class OverloadingSwap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swap s=new Swap();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the integers num:");
		int inum1=sc.nextInt();
		int inum2=sc.nextInt();
		s.swap(inum1,inum2);
		System.out.println("enter float values:");
		float fnum1=sc.nextInt();
		float fnum2=sc.nextInt();
		s.swap(fnum1, fnum2);
		System.out.println("enter double values:");
		double dnum1=sc.nextInt();
		double dnum2=sc.nextInt();
		s.swap(dnum1, dnum2);
		System.out.println("enter strings:");
		String Sstr1=new String();
		Sstr1=sc.next();
		String Sstr2=new String();
		Sstr2=sc.next();
		s.swap(Sstr1,Sstr2);

	}

}
