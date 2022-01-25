import java.util.Scanner;


class MarksOutOfBoundsException extends Exception
{
	public MarksOutOfBoundsException(String msg)
	{
		super(msg);
	}
	public String toString(){
		return this.getMessage();
	}
}
class SubjectMarks
{
	public void isCorrect(int marks) throws MarksOutOfBoundsException
	{
		if(marks>100 || marks<0){
			throw new MarksOutOfBoundsException("marks out of bounds exception");
		}
		else
		{
			System.out.println("valid marks");
		}
		
	}
}
public class MarksDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		SubjectMarks sm=new SubjectMarks();
		Scanner sc=new Scanner(System.in);
		int sub1=sc.nextInt();
		int sub2=sc.nextInt();
		int sub3=sc.nextInt();
		try
		{
			sm.isCorrect(sub1);
			sm.isCorrect(sub2);
			sm.isCorrect(sub3);
		}
		
		catch(MarksOutOfBoundsException mb)
		{
			System.out.println(mb);
		}
		finally{
			int result=sub1+sub2+sub3;
			System.out.println("sum of the three subjects marks :"+result);
		}
		
	}
	
}

