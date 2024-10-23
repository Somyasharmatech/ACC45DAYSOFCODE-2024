import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		while(a-->0){
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    int d = sc.nextInt();
		    if(b<d){
		        System.out.println("1");
		        return;
		    }
		    int spl=b-d;
		    int count=spl/c;
		    if(spl-count*c==0){
		        count =count;
		    }
		    else{
		        count++;
		    }
		    int numAttacks=count+1;
		    System.out.println(numAttacks);
		    
		}

	}
}
