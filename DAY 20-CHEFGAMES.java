import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t,a,b,c,d;
		t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    a=sc.nextInt();
		    b=sc.nextInt();
		    c=sc.nextInt();
		    d=sc.nextInt();
		    if(a==0 && b==0 && c==0 && d==0)
		    System.out.println("in");
		    else if(a==1 || b==1 || c==1 || d==1)
		    System.out.println("out");
		}

	}
}
