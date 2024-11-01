import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            if (c < a || d < b) {
                System.out.println("impossible");
            }
            else {
                for (int i = 1; i <= c; i++) {
                    a++;
                }
                for (int i = 1; i <= d; i++) {
                    b++;
                }
                if (a >= c && b >= d) {
                    System.out.println("possible");
                } else {
                    System.out.println("impossible");
                }
		    }
		   
		}

	}
}
