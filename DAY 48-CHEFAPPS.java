import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			int t,s,x,y,z;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		while(t!=0){
		    s=sc.nextInt();
		    x=sc.nextInt();
		    y=sc.nextInt();
		    z=sc.nextInt();
		    if(x+y+z<=s) System.out.println("0");
		    else if(x+z<=s || y+z<=s) System.out.println("1");
		    else System.out.println("2");
		    t--;
		}

	}
}
