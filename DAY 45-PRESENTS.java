import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0; i<t; i++){
		    int n = sc.nextInt();
		    if((n/5 >= 0)){
		        System.out.println(n-(n/5));
		    }
		    else{
		        System.out.println(n);
		    }
		}

	}
}
