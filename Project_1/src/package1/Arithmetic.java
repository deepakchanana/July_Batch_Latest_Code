package package1;

public class Arithmetic {
	
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("result is "+c);
		return c;
	}
	public int sub(int x1,int x2)
	{
		int x3;
		x3=x1-x2;
		System.out.println("result is "+x3);
		return x3;
	}
	public void multi(int s,int r)
	{
		int result;
		result=s*r;
		System.out.println("final result is "+result);
	}
	public static void main(String[] args) 
	{
	  Arithmetic obj=new Arithmetic();
	  int sumresult=obj.sum(10, 2);
	  int subresult=obj.sub(10,2);
	  obj.multi(sumresult, subresult);
	}

}
