import java.util.Stack;

public class StackQuestion {
	public static void dispStack(Stack<Integer> s)
	{
		System.out.println(s);
	}
	public static void main(String[] args)
	{
		Stack<Integer> s =new Stack<>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		dispStack(s);
		s.pop();
		s.pop();
		s.push(100);
		dispStack(s);
		System.out.println(s.get(3));
	}
}
