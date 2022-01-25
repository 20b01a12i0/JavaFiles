import java.util.Scanner;


public class TextBook {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name=" ";
		String author=" ";
		int pages,price;
		System.out.println("enter name of the book");
		name=sc.nextLine();
		System.out.println("enter name of the author");
		author=sc.nextLine();
		System.out.println("ennter no.of pages");
		pages=sc.nextInt();
		System.out.println("enter price of the book");
		price=sc.nextInt();
		TextBookDetails tb=new TextBookDetails(name,author,pages,price);
		System.out.println(tb);
		try{
			if(pages<0){
				throw new NegativePagesException("will be no negative pages");
			}
		}
			catch(NegativePagesException npa){
				System.out.println(npa.getMessage());
			}
		try{
			if(price<0){
				throw new NegativePriceException("will be no negative price");
			}
		}
		catch(NegativePriceException npr ){
			System.out.println(npr.getMessage());
		}
		finally{
			System.out.println("finally block");
		}

	}

}
