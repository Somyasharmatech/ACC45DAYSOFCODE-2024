import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		long t = sc.nextLong();
		while(t != 0){
		    long x=sc.nextLong();
		    long y=sc.nextLong();
		    
		   if (y % x != 0){
		       System.out.println(y/x);
		   }else{
		       System.out.println((y/x)-1);
		   }
		    
		    t--;
		}

	}
}
