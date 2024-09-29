import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t =sc.nextInt();
	    while(t-->0){
	        int a=sc.nextInt();
	        int cost=sc.nextInt();
	        double b=a/6.0;
	        int val=(int) Math.ceil(b);
	        System.out.println(val*cost);
	    }

	}
}
