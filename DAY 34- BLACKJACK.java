import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t;
		t=sc.nextInt();
		while(t-->0){
		    int a,b;
		    a=sc.nextInt();
		    b=sc.nextInt();
		    int d=0;
		    for(int i=1;i<=10;i++){
		        d=a+b+i;
		        if(d==21){
		            System.out.println(i);
		            break;
		        }
		        
		    }
		    if(d!=21)System.out.println(-1);
		}

	}
}
