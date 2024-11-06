import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(b*1+c*2>=a)
		System.out.println("Qualify");
		else
		System.out.println("NotQualify");
		}
		

	}
}
