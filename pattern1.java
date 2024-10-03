import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n=5;
		int count=0;
		for(int i=65+n;i>=65;i--){
		    for(int j=i;j<i+count;j++){
		        System.out.print((char)j+" ");
		    }
		    count++;
		    System.out.println();
		}

	}
}
/*
E 
D E 
C D E 
B C D E 
A B C D E */
