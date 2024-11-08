import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int t,n;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		for(int i=0;i<t;i++){
		    n=sc.nextInt();
		    
		    int sum=0;
		    int arr[]=new int[n];
		    for(int j=0;j<n;j++){
		        arr[j]=sc.nextInt();
		        sum=sum+arr[j];
		        
		    }
		    if(sum%2==0){
		        System.out.println(Math.abs(sum/2));
		    }else{
		        System.out.println(-1);
		    }
		}

	}
}
