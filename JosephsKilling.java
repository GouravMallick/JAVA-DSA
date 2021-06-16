package gfgjava.Recursion;

public class JosephsKilling {

	public static void main(String[] args) {
		System.out.println(fun2(5,3));

	}
	static int fun1(int n,int k)
	{
		if(n==1) return 0;
		else
		return (fun1(n-1,k)+k)%n;
	}
	static int fun2(int n,int k)
	{
		return fun1( n, k)+1;
	}
	

}
