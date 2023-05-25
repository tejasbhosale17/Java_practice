import java.util.Scanner;

class Node
{
	int data;
	Node next;
	public Node(int data,Node next){
		this.data=data;
		this.next=next;
	}
	
    public Node(int data){
    	this.data = data;
    	this.next=null;
    }
//    
//	public Node getNext(){
//		return next;
//	}
//	
//	public void setNext(Node n){
//		this.next=next;
//	}
//	
//	public int getData(){
//		return data;
//	}
}
//-----------------------------------------------------------
public class SinglyLinkedList {
	public Node head;
	public SinglyLinkedList()
	{
		head=null;
	}
//-----------------------------------------------------------	
	boolean isEmpty()
	{
		return(head==null);
	}
//-----------------------------------------------------------	
	public void traversal(Node temp)
	{

			while(temp.next!=null);{
				temp=temp.next;
			}
	}
//---------------------------------------------------------	
	public Node findPrevious(int n)
	{
		Node temp=head;
		Node prev=null;
		while(temp!=null)
		{
			if(temp.data!=n)
			{
				prev=temp;
				temp=temp.next;
			}else
				break;
		}
		
		return prev;
	}
//------------------------------------------------------------	
	public Node findNode(int ref) throws Exception
	{
		if(!isEmpty())
		{
			Node temp =head;
			do{
				if(temp.data==ref)
				{
					return temp;
				}
				else
				{
					temp=temp.next;
				}	
			}while(temp!=null);
			throw new Exception ("Node not Found");
		}else
			throw new Exception ("List is empty!");
	}
//--------------------------------------------------------	
	public void append(int data)
	{
		
		Node nes= new Node(data);
		nes.next=null;
		if(isEmpty())
		{
			head=nes;
		}
		else
		{
			Node temp =head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			//nes.next=temp.next;
			temp.next=nes;
		}
	}
//-------------------------------------------------------
	public void insertBegin(int data)
	{
		Node temp= new Node(data);
		temp.next=head;
		head=temp;
		
	}
//---------------------------------------------------------------
	public void insertatPos(int pos,int data)
	{
		Node n = new Node(data);
		if(pos==1)
		{
			n.next=head;
			head=n;
		}
		else
		{
			Node temp=head;
			Node prev=null;
			for(int i=1;i<pos;i++)
			{
				prev=temp;
				temp=temp.next;
			}
			prev.next=n;
			n.next=temp;
		}	
	}
//-------------------------------------------------------------	
	public void inserAfter(int ref,int data) throws Exception
	{
		Node n= new Node(data);
		Node x =findNode(ref);
		n.next=x.next;
		x.next=n;
	}
//-----------------------------------------------------------
	public void insertBefore(int ref,int data) throws Exception
	{
		Node n = new Node(data);
		Node prev =findPrevious(ref);
		Node t = findNode(ref);
		
		if(prev==null)
		{
			head=n;
			n.next=t;
		}
		else
		{
			prev.next=n;
			n.next=t;
			
		}
	}
	//-------------------------------------------------------
	public void delBegin()
	{
		if(!isEmpty())
		{
//			Node temp=head;
			head=head.next;
		}else
			System.out.println("List is Empty!");
	}
//------------------------------------------------------------	
	public void delEnd()
	{
		if(!isEmpty())
		{
			Node temp=head;
			Node prev=null;
			while(temp!=null)
			{	prev=temp;
				temp=temp.next;
			}
			if(prev==null){
				head=null;
			}
			else{
				temp=prev;
				temp.next=null;
			}
		}
		else
			System.out.println("List is Empty!");
	}
//-----------------------------------------------------------
	
	public void display()
	{
		if(!isEmpty())
		{
			Node temp =head;
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println("");
		}
		else
			System.out.println("List is Empty!");
	}
//------------------------------------------------------------	
public static void main(String[] args) throws Exception
{
	SinglyLinkedList sll = new SinglyLinkedList();
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter no of elements:");
	int n=scan.nextInt();
	int a[]=new int[n];
	System.out.println("Enter elements of Linkedlist:");
	for(int i=0;i<n;i++)
	{
		a[i]=scan.nextInt();
		sll.append(a[i]);
	}
	sll.display();
	System.out.println("Enter position and data ti insert:");
	sll.insertatPos(scan.nextInt(), scan.nextInt());
	sll.display();
	System.out.println("Enter data to insert at begin");
	sll.insertBegin(scan.nextInt());
	System.out.println("Enter posi and data you want to insert before");
	sll.insertBefore(scan.nextInt(), scan.nextInt());
	sll.display();
	System.out.println("Enter posi and data you want to insert after");
	sll.inserAfter(scan.nextInt(), scan.nextInt());
	sll.delBegin();
	System.out.println("After delete Begin");
	sll.display();
}
}