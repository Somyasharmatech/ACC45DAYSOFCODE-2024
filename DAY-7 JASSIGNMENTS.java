import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		int p=sc.nextInt();
		for(int t=0;t<p;t++)
		{
		    int n =sc.nextInt();
		    if(10-n>=3)
		    {
		        System.out.println("yes");
		    }else{
		        System.out.println("no");
		    }
		}

	}
}
