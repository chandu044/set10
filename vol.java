/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int l=s.nextInt();
		int b=s.nextInt();
		int h=s.nextInt();
		int a=2*((l*b)+(b*h)+(h*l));
		int v=l*b*h;
		System.out.print(a+" "+v);
	}
}
