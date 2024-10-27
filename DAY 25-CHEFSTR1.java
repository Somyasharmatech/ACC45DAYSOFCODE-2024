import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner (System.in);
		int t =sc.nextInt();
		while(t-->0){
		    int n =sc.nextInt();
		    int[] s= new int[n];
		    for(int j=0;j<n;j++){
		        s[j]=sc.nextInt();
		        
		    }
		    long x=0;
		    for(int j=0;j<n-1;j++){
		        if(s[j]!=0){
		            x=x+Math.abs(s[j]-s[j+1]);
		        }
		    }
		    System.out.println(x-n+1);
		}

	}
}
