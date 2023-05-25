class Book
{
	String name;
	int price;
	String Authorname;
	int isbn;
	String Publication;
	
	Book(String name,int price,String Authorname,int isbn,String Publication)
	{
		this.name=name;
		this.price=price;
		this.Authorname=Authorname;
		this.isbn=isbn;
		this.Publication=Publication;
	}
	
	public void disp()
	{
		System.out.println(name+" "+price+" "+Authorname+" "+isbn+" "+Publication);
	}
}

