import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc =new Scanner(System.in);
		int a =sc.nextInt();
		for(int i=0;i<a;i++){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    if((x+y+1)<2){
		        System.out.println("Alice");
		    }
		    else {
		        if ((((x+y+1)%4)==1)||(((x+y+1)%4)==2)){
		            System.out.println("Alice");
		        }else{
		            System.out.println("Bob");
		        }
		    }
		}

	}
}
