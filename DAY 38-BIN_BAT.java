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
		    int count=0;
		    int p=sc.nextInt();
		    int q=sc.nextInt();
		    int r=sc.nextInt();
		    for(int i=0;i<p;i++){
		        if(Math.pow(2,i)==p){
		            count=i;
		            break;
		        }
		    }
		    int ans=q*count;
		    int br=(count-1)*r;   //br=break
		    System.out.println(ans+br);
		}

	}
}
