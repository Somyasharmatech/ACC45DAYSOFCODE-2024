import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int p=sc.nextInt();
		    int q=sc.nextInt();
		    int r=sc.nextInt();
		  int s=q*r;
		  int u=0;
		  if(p%s!=0)
		  {
		      u++;
		  }
		  System.out.println((p/s)+u);
		}

	}
}
