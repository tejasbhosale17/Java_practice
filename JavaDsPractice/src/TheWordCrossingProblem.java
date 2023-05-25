import java.util.Scanner;

public class TheWordCrossingProblem {
	public void WordCrossing()
	{
		int x,y,r=0,t=0,ax=0,sndstrind;
		int match=0;
		int count=0;
		int enm=0;
		String str1,str2;
		char sarkha = 0;
		char a[][]=new char[10][10];
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first string:");
		str1=scan.next();
		System.out.println("Enter co-ordinated of first element:");
		x=scan.nextInt();//row
		y=scan.nextInt();//col
		System.out.println("Enter second string:");
		str2=scan.next();
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				a[i][j]='*';
			}
		}
		for(int k=x;k<(x+str1.length());k++)
		{
			a[k][y]=str1.charAt(count);
			count++;
		}
		
		for(int p=0;p<str1.length();p++)
		{
			for(int q=0;q<str2.length();q++)
			{
				if(str1.charAt(p)==str2.charAt(q))
				{
					sarkha=str2.charAt(q);
//					System.out.println(sarkha);
				}
			}
		}
		
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				if(a[i][j]==sarkha)
				{
					r=i;
					t=j;	
//					System.out.println(r+" "+t);
				}
			}
		}
		for(int d=0;d<str2.length();d++)
		{
			if(str2.charAt(d)==sarkha)
			{
//				System.out.println(d);
				ax=d;
			}
		}

		//match=str2.length()-ax;
		sndstrind=t-ax;
//		System.out.println(sndstrind);
		for(int m=sndstrind;m<(sndstrind+str2.length());m++)
		{
			a[r][m]=str2.charAt(enm);
			enm++;
		}
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}
public static void main(String[] args) {
	TheWordCrossingProblem twp = new TheWordCrossingProblem();
	
	twp.WordCrossing();
}
}
