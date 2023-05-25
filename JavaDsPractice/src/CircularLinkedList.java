
class Nodee
{

	int data;
	Nodee next;
	public Nodee(int data,Nodee next){
		this.data=data;
		this.next=next;
	}
	
    public Nodee(int data){
    	this.data = data;
    	this.next=null;
    }
    
	public Nodee getNext(){
		return next;
	}
	
//	public void setNext(Node n){
//		this.next=next;
//	}
	
	public int getData(){
		return data;
	}
}
public class CircularLinkedList {
	public Nodee head;
	CircularLinkedList()
	{
		head=null;
	}
	boolean isEmpty()
	{
		return(head==null);
	}
//--------------------------------------------------------------------------------------
	Nodee findPrevious(Nodee x)
	  {
		  Nodee temp=head.next;
			Nodee prev=null;
			while(temp!=head)
			{
				if(temp.data==x.data)
				{
					break;
				}
				else
				{
					prev=temp;
					temp=temp.next;
				}
			}	
		  return prev;
	  }
//-----------------------------------------------------------------------------------
	public void insertbegin(int data)
	{
		Nodee n =new Nodee(data);
		if(!isEmpty())
		{
			n.next=head.next;
			head.next=n;
		}else
		{
			head=n;
			n.next=n;
		}
	}
//------------------------------------------------------------------------------------
	public void insertEnd(int data)
	{
		Nodee n =new Nodee(data);
		if(!isEmpty())
		{
			n.next=head.next;
			head.next=n;
			head=n;
		}else
		{
			head=n;
			n.next=n;
		}
	}
//----------------------------------------------------------------------------------
	public Nodee findNode(int ref) throws Exception
	{
		if(!isEmpty())
		{
			Nodee temp =head.next;
			do
			{
				if(temp.data==ref)
				{
					return temp;
				}else
				{
					temp=temp.next;
				}
				
			}while(temp!=head);
			if(temp.data==ref)
			{
				return temp;
			}
			else
				throw new Exception ("Node not found!");
		}else
			throw new Exception ("List is Empty!");
	}
//----------------------------------------------------------------------------------------
	
	public void insertBefore(Nodee x,int data)
	{
		Nodee n =new Nodee(data);
		Nodee prev =findPrevious(x);
		n.next=x;
		prev.next=n;
	}
//------------------------------------------------------------------------------------	
	public void insertAfter(int ref,int data) throws Exception
	{
		Nodee n = new Nodee(data);
		Nodee xtr = head;
		if(xtr!=head)
		{
			Nodee temp = findNode(ref);
			n.next=temp.next;
			temp.next=n;
		}
		else
		{
			Nodee temp = findNode(ref);
			n.next=temp.next;
			temp.next=n;
			head=n;
		}
		
	}
//-----------------------------------------------------------------------------------
	public void delete(int ref) throws Exception
	{
		Nodee temp = head;
		
		if(!isEmpty())
		{
			while(temp.data!=ref)
			{
				temp=temp.next;
			}
			if(temp==head.next)
			{
				deleteBegin();
			}else if(temp==head)
			{
				deleteEnd();
			}else
			{
				Nodee prev =findPrevious(temp);
				prev.next=temp.next;
				temp=temp.next;
			}
			
		}else
			throw new Exception ("List is Empty!");
	}
		
//--------------------------------------------------------------------------------
	public void deleteBegin()
	{
		if(!isEmpty())
		{
			Nodee temp =head.next;
			head.next=temp.next;
		}else
			System.out.println("List is Empty!");
	}
//----------------------------------------------------------------------------------
	public void deleteEnd()
	{
		if(!isEmpty())
		{
			Nodee temp= head.next;
			Nodee prev= findPrevious(head);
			prev.next=temp;
			head=prev;
		}
	}
//-----------------------------------------------------------------------------
	public void deleteAfter(int ref) throws Exception
	{
		if(!isEmpty())
		{
			Nodee temp= head.next;
			while(temp!=head)
			{
				if(temp.data==ref)
				{
					break;
				}else
				{
					temp=temp.next;
				}
			}
			temp.next=temp.next.next;
		}else
			throw new Exception ("List is Empty!");
	}
//-----------------------------------------------------------------------------
	public void deleteBefore(int ref) throws Exception
	{
		if(!isEmpty())
		{
			Nodee temp= head.next;
			while(temp!=head)
			{
				if(temp.data==ref)
				{
					break;
				}else
				{
					temp=temp.next;
				}
			}
			if(temp==head.next)
			{
				deleteEnd();
			}
			else
			{
				Nodee prev= findPrevious(temp);
				Nodee pprev= findPrevious(prev);
				pprev.next=temp;
			}
			
		}else
			throw new Exception ("List is Empty!");
	}
//---------------------------------------------------------------------------
	public void display()
	{
		if(!isEmpty())
		{
			Nodee temp =head.next;
			while(temp!=head)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println(temp.data);
//			System.out.println("");
		}else
		{
			System.out.println("List is Empty!");
		}
	}
//-----------------------------------------------------------------------------
	
	
public static void main(String[] args) throws Exception {
	CircularLinkedList cll =new CircularLinkedList();
	cll.insertEnd(10);
	cll.insertEnd(20);
	cll.insertEnd(30);
	cll.insertEnd(40);
	cll.insertEnd(50);
	cll.display();
	Nodee t= cll.findNode(10);
	cll.insertBefore(t,100);
	cll.insertAfter(50, 200);
	cll.deleteBegin();
	cll.delete(40);
	cll.deleteEnd();
	cll.deleteAfter(10);
	cll.deleteBefore(10);
	cll.display();
}
}
