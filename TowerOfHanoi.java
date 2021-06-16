package gfgjava.Recursion;

public class TowerOfHanoi {
	public static void main(String[] args)
	{
		int n=3;
		getAns(n,'A', 'B', 'C');
	}
	static void getAns(int n,char A,char B,char C)
	{
		if(n==1)
		{
			System.out.println(1+" is move from "+A +" to "+C);
			return ;
		}
		getAns(n-1,A,C,B);
		System.out.println(n+" is move from "+A +" to "+C);
		getAns(n-1,B,A,C);
	}

}
