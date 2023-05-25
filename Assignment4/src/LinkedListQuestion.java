import java.util.Collections;
import java.util.LinkedList;

public class LinkedListQuestion {
	public static void dispLinkedList(LinkedList<Integer> ll)
	{
		System.out.println(ll);
	}
	
	public static LinkedList<Integer> reverseLinkedlist(LinkedList<Integer> ll) 
	{
//		Collections.reverse(ll);
//		System.out.println(ll);
		LinkedList<Integer> llist = new LinkedList<>();
		for(int i=ll.size()-1;i>=0;i--)
		{
			llist.add(ll.get(i));
		}
		return llist;
	}
	
	public static void main(String[] args)
	{
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		System.out.println(ll.size());
		dispLinkedList(ll);
		ll.addFirst(100);
		dispLinkedList(ll);
		ll.add(2, 300);
		dispLinkedList(ll);
		ll.removeFirst();
		dispLinkedList(ll);
		ll.remove(4);
		dispLinkedList(ll);
		LinkedList<Integer> revlist=reverseLinkedlist(ll);
		dispLinkedList(revlist);
	}
}
