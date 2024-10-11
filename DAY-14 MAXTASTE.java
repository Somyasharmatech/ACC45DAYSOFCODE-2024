import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n-->0){
		    int p=sc.nextInt();
		    int q=sc.nextInt();
		    int r=sc.nextInt();
		    int s=sc.nextInt();
		    
		    if(p>q){
		        if(r>s)
		        System.out.println(p+r);
		        else
		        System.out.println(p+s);
		    }
		    else if(p<q){
		        if(r>s)
		        System.out.println(q+r);
		        else
		        System.out.println(q+s);
		    }
		    else
		    System.out.println(p+r);
		}

	}
}
