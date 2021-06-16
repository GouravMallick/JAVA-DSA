package gfgjava.Recursion;

public class Subset {
	public static void main (String args[] )
	{
	  String s= "ABC";
      printSub(s, "", 0);
	}
	static void printSub(String s,String curr,int index)
	{
		
		if(index==s.length())
		{
			System.out.print(curr+" ");
			return;
		}
		printSub(s,curr,index+1);
		printSub(s,curr+s.charAt(index),index+1);
		
	}

}
