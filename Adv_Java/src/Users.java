public class Users
{
	int no;
	String name;
	int age;
	String username;
	String password;
	Users(int no,String name,int age,String username,String password)
	{
		this.no=no;
		this.name=name;
		this.age=age;
		this.username=username;
		this.password=password;
	}
	
	void DisplayUsers()
	{
		System.out.println(no+" "+name+" "+age+" "+username+" "+password);
	}
	
}

