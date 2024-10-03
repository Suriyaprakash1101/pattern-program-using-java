import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		
        int n=4;
        for(int i=0;i<n-2;i++){
            System.out.print(" ");
        }
        System.out.println(" "+1);
		int count=1;
		for(int i=2;i<=n;i++){
		    for(int j=0;j<n-i;j++){
		        System.out.print(" ");
		    }
		    for(int j=i;j<=i+count;j++){
		        System.out.print(j);
		    }
		    for(int j=i+count-1;j>=i;j--){
		        System.out.print(j);
		    }
		    count++;
		    System.out.println();
		}

	}
}
/*
   1
  232
 34543
4567654
*/
