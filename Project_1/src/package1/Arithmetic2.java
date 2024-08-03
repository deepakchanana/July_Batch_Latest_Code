package package1;

public class Arithmetic2 {
	
	public int sum(int a,int b) // sum method
	{
		int c;
		c=a+b;
		System.out.println("result is "+c);
		System.out.println("changes done by dc");
		return c; // returning the addition of two number
	}
	public int sub(int a1,int b1) // sub method
	{
		int c1;
		c1=a1-b1;
		System.out.println("result is "+c1);
		return c1; // returning the subtraction of two number
	}
	public int multi(int a2,int b2) // multi method
	{
		int c2;
		c2=a2*b2;
		System.out.println("result is "+c2);
		return c2;  // returning the multiplication of two number
	}
	public void div(int a3,int a4)  // division method
	{
		int result;
		result=a3/a4;
		System.out.println("final result is "+result);
	}
	public static void main(String[] args) 
	{
	 Arithmetic2 ob=new Arithmetic2(); // object creation
	 int sumresult1=ob.sum(10, 2);  // calling the sum method
	 int sumresult2=ob.sum(sumresult1,2); // calling the sum method again
	 int subresult=ob.sub(sumresult2, 2); // calling the subtraction meth
	 int multiresult=ob.multi(subresult, 2); // calling the multi method	
	 ob.div(multiresult, 2); // calling the division method
	}
}
