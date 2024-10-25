import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0){
		    int cs=0,cl=0;
		    int n=sc.nextInt();
		    while(n>0){
		        String s=sc.next();
		        if(s.equals("START38")){
		            cs++;
		        }else{
		            cl++;
		            
		        }
		        n--;
		    }
		    System.out.println(cs+" "+cl);
		    t--;
		}

	}
}
