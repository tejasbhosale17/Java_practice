import java.util.Scanner;

class Tnode
{
	int data;
	Tnode left;
	Tnode right;
	
	Tnode(int data)
	{
		this.data=data;
		left=null;
		right=null;
	}
	Tnode(int data,Tnode left,Tnode right)
	{
		this.data=data;
		this.left=left;
		this.right=right;
	}
}
public class BinarySearchTreeRecursion {
	public static Tnode root;
	public BinarySearchTreeRecursion() {
	root=null;
	}
//----------------------------------------------------------------------
	public Tnode insertNode(Tnode root,int data)
	{
		Tnode n = new Tnode(data);
		if(root==null)
		{
			root=n;
			return n;
		}
		else if(data <root.data)
		{
			root.left=insertNode(root.left,data);
		}else
		{
			root.right=insertNode(root.right,data);
		}
		return root;
	}
//------------------------------------------------------------------------
	public void display(Tnode root)
	{
		if(root!=null)
		{
			display(root.left);
			System.out.println(root.data);
			display(root.right);
		}
	}

//------------------------------------------------
	
	public int getval( Tnode T)
	{
	int value =0; 
	if((T.left== null) && (T.right == null))
	{
		value =1;
	}else
	{
		value =value+ getval(T.left)+ getval(T.right);
	}
	return value;
	}
//------------------------------------------------------------------
public static void main(String[] args) {
	BinarySearchTreeRecursion bst = new BinarySearchTreeRecursion();
	System.out.println("Enter no of nodes:");
	Scanner scan = new Scanner(System.in);
	int n= scan.nextInt();
	for(int  i=0;i<n;i++)
	{
		root=bst.insertNode(root, scan.nextInt());
	}
    bst.display(root);
    int valll=bst.getval(root);
}
}
