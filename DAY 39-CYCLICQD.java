import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int t,a,b,c,d;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		for(int i=0;i<t;i++){
		    a=sc.nextInt();
		    b=sc.nextInt();
		    c=sc.nextInt();
		    d=sc.nextInt();
		    if(a+c==180 && b+d==180){
		        System.out.println("YES");
		    }
		    else
		    System.out.println("NO");
		}

	}
}
