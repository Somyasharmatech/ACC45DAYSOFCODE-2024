import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int n=sc.nextInt();
		    int x=sc.nextInt();
		    int p=sc.nextInt();
		    int c=x*3;
		    int y=n-x;
		    if((c-y)>=p){
		        System.out.println("PASS");
		    }
		    else{
		        System.out.println("FAIL");
		    }
		}

	}
}
