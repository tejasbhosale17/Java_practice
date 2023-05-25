import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A4QHashMapBook {
	public static HashMap<Integer,Book> createmap()
	{
		HashMap<Integer,Book> hm= new HashMap<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no of books");
		int n= scan.nextInt();
		Book[] b= new Book[n];
		System.out.println("Enter name,price,Author,isbn no,publication:");
		for(int i=0;i<n;i++)
		{
			b[i]=new Book(scan.next(),scan.nextInt(),scan.next(),scan.nextInt(),scan.next());
			hm.put(i,b[i]);
		}
		
		return hm;
	}
	
	public static void display(HashMap<Integer,Book> hm)
	{
		for(Map.Entry<Integer, Book> p: hm.entrySet())
		{
			System.out.print(p.getKey()+" ");
			p.getValue().disp();
		}
	}
	
	public static void searchBook(HashMap<Integer,Book> hm,int pos)
	{
		for(Map.Entry<Integer, Book> p: hm.entrySet())
		{
			if(p.getKey()==pos)
			{
				System.out.print(p.getKey()+" ");
				p.getValue().disp();
			}
			
		}
	}
	
	public static void reduceprice(HashMap<Integer,Book> hm,int bid)
	{
		for(Map.Entry<Integer, Book> p: hm.entrySet())
		{
			if(p.getKey()==bid)
			{
				//int bprice=p.getValue().price;
				p.getValue().price=p.getValue().price-((p.getValue().price*10)/100);

				System.out.print(p.getKey()+" ");
				p.getValue().disp();
			}
		}
	}
	
	public static void removeBook(HashMap<Integer,Book> hm,int isbnno) 
	{
		for(Map.Entry<Integer, Book> p: hm.entrySet())
		{
			int key=0;
			if(p.getValue().isbn==isbnno)
			{
				key=p.getKey();
			}
			hm.remove(key);
		}
		System.out.println("after removing empno");
		
		for(Map.Entry<Integer, Book> p: hm.entrySet())
		{
			System.out.print(p.getKey() +" ");
			p.getValue().disp();
		}
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		HashMap<Integer,Book> hm=createmap();
		display(hm);
		System.out.println("Enter keyvalue of the book you want to see:");
		int pos=scan.nextInt();
		searchBook(hm,pos);
		System.out.println("Enter bookid of the book you want to reduce thr price:");
		int bid=scan.nextInt();
		reduceprice(hm,bid);
		System.out.println("Enter book id to remove book:");
		int isbnno=scan.nextInt();
		removeBook(hm,isbnno);
		display(hm);
	}
}
