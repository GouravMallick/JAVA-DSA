package gfgjava.Recursion;

public class SumOfDigits {
	public static void main(String[] args)
	{
		System.out.println(getSum(541));
	}
	
	static int getSum(int n)
	{
		if(n==0) return 0;
		return getSum(n/10)+n%10;
	}

}
