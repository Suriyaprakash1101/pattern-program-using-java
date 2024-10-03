import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Character");
// 		int n=(int)in.next().charAt(0)-65;
        int n=5;
		int count=0;
		for(int i=65;i<65+n;i++){
		    
		    for(int j=i;j<=i+count;j++){
		        System.out.print((char)j);
		        
		    }
		    count++;
		    System.out.println();
		}

	}
}
/*
A
BC
CDE
DEFG
EFGHI
FGHIJK*/
