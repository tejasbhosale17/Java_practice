import java.util.Scanner;

class Bnode
{
	int data;
	Bnode left;
	Bnode right;
	public Bnode(int data) {
		this.data = data;
		left =right=null;
	}
	public Bnode(int data, Bnode left, Bnode right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
}
public class BinarySearchTree {
	static Bnode root;
	BinarySearchTree() {
		root=null;
	}
	public void insert(Bnode p, int data)
	{
		if(p==null)
		{
			if(root==null)
			{
				p=new Bnode(data);
				root=p;
				return;
			}
		}
		if(data<p.data)
		{
			if(p.left==null)
			{
				p.left=new Bnode(data);
				System.out.println(data);
				return;
			}
			else
				insert(p.left,data);
			
		}else
			if(p.right==null)
			{
				p.right =new Bnode(data);
				return;
			}
			else
				insert(p.right,data);
	}
	//------------------------------------------------------------------------
		public void display(Bnode root)
		{
			if(root!=null)
			{
				display(root.left);
				System.out.print(root.data+" ");
				display(root.right);
			}
		}
//------------------------------------------------------------------------

	void postorder(Bnode root)
	{
		 if(root!=null)
	        {
	            postorder(root.left);
	            postorder(root.right);
	            System.out.print(root.data+" ");
	        }
		 
	}
//---------------------------------------------------------------
	void preorder(Bnode root)
	{
	    if(root!=null)
	        {
	            System.out.print(root.data+" ");
	            preorder(root.left);
	            preorder(root.right);
	        }
	}
//----------------------------------------------------------------------------
	
	void inorder(Bnode root)
	{
	    if(root!=null)
	        {
	            inorder(root.left);
	            System.out.print(root.data+" ");
	            inorder(root.right);
	        }
	}
//--------------------------------------------------------------------------------
	public void search(Bnode root,int ref)
	{
		if(root!=null)
		{
			if(root.data==ref)
			{
				System.out.println("Search Result:"+root.data);
			}
			else if(ref<root.data)
			{
				search(root.left,ref);
			}else
			{
				search(root.right,ref);
			}		
		}else
		{
			System.out.println("root is null:");
		}
	}
//-------------------------------------------------------------------
	public Bnode searchNode(Bnode root,int ref)
	{
		if(root!=null)
		{
			if(root.data==ref)
			{
				return root;
			}
			else if(ref<root.data)
			{
				root=searchNode(root.left,ref);
			}else
			{
				root=searchNode(root.right,ref);
			}		
		}
		return root;
	}
//--------------------------------------------------------------------
	
	public static void main(String[] args) {
		BinarySearchTree bst= new BinarySearchTree();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of BST:");
		int n=scan.nextInt();
		for(int i=0;i<n;i++)
		{
			bst.insert(root, scan.nextInt());
		}
		bst.display(root);
		System.out.println("");
		System.out.println("Enter what u waant to search: ");
		//bst.search(root, scan.nextInt());
		Bnode temp = bst.searchNode(root, scan.nextInt());
		if(temp!=null)
		{
			System.out.println("Node found "+temp.data);
		}
		else
			System.out.println("Node not found!");
//		System.out.println("Inorder:");
//		bst.inorder(root);
//		System.out.println("");
//		System.out.println("preorder:");
//		bst.preorder(root);
//		System.out.println("");
//		System.out.println("postorder:");
//		bst.postorder(root);
	}
}
