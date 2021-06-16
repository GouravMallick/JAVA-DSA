package gfgjava.Recursion;

public class SumOfNaturalNos {
	public static void main (String[] args)
	{
		System.out.print(fun(5));
	}
	 static int fun(int n)
	 {
		 if(n==0) return 0;
		 return n+fun(n-1);
	 }

}
