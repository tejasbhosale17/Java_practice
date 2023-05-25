import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

class NameComparator implements Comparator<Player>
{
	public int compare(Player s1,Player s2)
	{
		return s1.pname.compareTo(s2.pname);
	}

}
public class A4QPlayersDetailArraylistwithObject 
{
	private static ArrayList<Player> addPlayer()
	{
		ArrayList<Player> pl = new ArrayList<>();
		System.out.println("Enter no of players");
		Scanner scan= new Scanner(System.in);
		int n= scan.nextInt();
		Player[] p = new Player[n];
		System.out.println("Enter name,trun,nwickets,nmatches,ncentury,category:");
		for(int i=0;i<n;i++)
		{
			p[i]= new Player(scan.next(),scan.nextFloat(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.next());
			pl.add(p[i]);
		}
		return pl;
	}
//-------------------------------------------------------------------------------------------------------------------------------
	
	public static void DisPlayers(ArrayList<Player> pl)
	{
		for(Player p: pl)
		{
			//System.out.println(p);
			System.out.println(p.pname+" "+p.trun+" "+p.nwicket+" "+p.nmatches+" "+p.ncentury+" "+p.category+" "+p.country);
		}
	}
//--------------------------------------------------------------------------------------------------------------------------------
	
	public static ArrayList<Player> RemoveifLT100run(ArrayList<Player> pl)
	{
		for(Player p: pl)
		{
			if(p.trun<100)
			{
				pl.remove(p);
			}
		}
		return pl;
	}
//---------------------------------------------------------------------------------------------------------------------------
	
	public static ArrayList<Player> updateCategory(ArrayList<Player> pl)
	{
		for(Player p: pl)
		{
			if(p.ncentury>10)
			{
				p.category="A";
			}
			else
			{
				p.category="B";
			}
		}
		return pl;
	}
//-----------------------------------------------------------------------------------------------------------------------------
	public static ArrayList<Player> MaxRun(ArrayList<Player> pl)
	{
		int max=0;
		for(Player p: pl)
		{
			
			if(p.trun >= max)
			{
				max=(int) p.trun;
			}
		}
		System.out.println(max);
		for(Player p: pl)
		{
			if(max==p.trun)
			{
				System.out.println(p);
			}
		}
		return pl;
	}
	
//	public static ArrayList<Player> SortAL(ArrayList<Player> pl)
//	{
//		for(Player p: pl)
//		{
//			Collections.sort(List<p.pname>);
//		}
//		return pl;
//	}
	
	static ArrayList<Player> sortPlayers(ArrayList<Player> pl)
	{
		Collections.sort(pl,new NameComparator());
//		ArrayList<Player> revplist = new ArrayList<>();
//		for(Player p: pl)
//		{
//			for(int i=5;i>0;i++)
//			{
//				revplist.add(p);
//			}
//		}
		return pl;
	}
	public static void main(String[] args)
	{
		ArrayList<Player> pl = addPlayer();
		DisPlayers(pl);
		System.out.println("");
		RemoveifLT100run(pl);
		DisPlayers(pl);
		System.out.println("");
		updateCategory(pl);
		DisPlayers(pl);
		System.out.println("");
		MaxRun(pl);
		sortPlayers(pl);
		DisPlayers(pl);
	}
}
