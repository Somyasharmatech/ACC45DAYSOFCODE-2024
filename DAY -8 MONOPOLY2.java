import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		while(p-->0){
		    int []a=new int[4];
		    for(int i=0;i<4;i++)
		    a[i]=sc.nextInt();
		    Arrays.sort(a);
		    if(a[0]+a[1]+a[2]<a[3])
		    System.out.println("yes");
		    else
		    System.out.println("no    ");
		}

	}
}
