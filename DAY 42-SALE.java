import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int x,y,z;
		int t;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		while(t!=0){
		    x=sc.nextInt();
		    y=sc.nextInt();
		    z=sc.nextInt();
		    int k=Math.min(x,Math.min(y,z));
		    System.out.println(x+y+z-k);
		    t--;
		}
		

	}
}
