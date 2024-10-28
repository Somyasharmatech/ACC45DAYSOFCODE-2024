import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int [] n1=new int[n];
            int count =0;
            for(int i=0;i<n;i++){
                n1[i]=sc.nextInt();
                
            }
            for(int j=0;j<n;j++){
                n1[j]=n1[j]+k;
                if(n1[j]%7==0)
                count++;
            }
            System.out.println(count);
        }

	}
}
