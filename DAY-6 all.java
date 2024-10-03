import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
          Scanner sc=new Scanner(System.in);
          int t =sc.nextInt();
          for(int i=0;i<t;i++){
              int a =sc.nextInt();
              int b =sc.nextInt();
              int c =(500-(2*a))+(1000-(4*(a+b)));
              int d =(500-(2*(a+b)))+(1000-(4*b));
              if(c>=d){
                  System.out.println(c);
              }else{
                  System.out.println(d);
              }
          }

	}
}
