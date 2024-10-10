import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		for(int i=0;i<n;i++){
		    float a=sc.nextInt();
		    float b=sc.nextInt();
		    if(b>=a/2)
		    System.out.println("YES");
		    else 
		    System.out.println("NO");
		    }

	}
}
