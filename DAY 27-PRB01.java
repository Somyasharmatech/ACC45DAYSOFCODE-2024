import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t,n;
		Scanner sc=new Scanner (System.in);
		t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int count=0;
		    n=sc.nextInt();
		    
		    for(int j=1;j<=n;j++){
		        if(n%j==0){
		            count++;
		        }
		    }
		    if(count==2){
		        System.out.println("yes");}
		        else
		        System.out.println("no");
		    }
		}
		
	    
	}

