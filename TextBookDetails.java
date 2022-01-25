
public class TextBookDetails {
	String name;
	String author;
	int pages;
	int price;
	public TextBookDetails(String n,String a,int p,int pr){
		name=n;
		author=a;
		pages=p;
		price=pr;
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
	public int getPages() {
		return pages;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int pr){
		price=pr;
	}
	public String toString(){
		String output="name:"+name+"  author:"+author+" pages:"+pages+" price:"+price;
		return output;
	}

}
