import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    int max=0;
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		        if(a[i]!=0){
		         
		         max=i;
		        
		    }
		}
		System.out.println(max);

	}
}
}