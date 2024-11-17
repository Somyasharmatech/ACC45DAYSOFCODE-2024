import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			// your code goes here
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
		    int X=sc.nextInt();
		    int Y=sc.nextInt();
		    int R=sc.nextInt();
		    int N=R/30;
		    int C=X+N;
		    int D=C/Y;
		    if(C%Y==0)System.out.println(D);
		    else System.out.println(D+1);
		    
		}

	}
}
