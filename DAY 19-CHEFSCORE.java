import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		while(a!=0){
		    int p=sc.nextInt();
		    int q=sc.nextInt();
		    int r=sc.nextInt();
		     
		    if(r%q==0 && (r%q)<=p)
		    System.out.println("yes");
		    else
		    System.out.println("no");
		    a--;
		}

	}
}
