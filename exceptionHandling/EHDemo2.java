package exceptionHandling;

public class EHDemo2 
{
	public static void main(String[] args) 
	{
		try
		{
			int x=0,y=10;
			int z=y/x;
			System.out.println("Will not get executed");
		}
		catch (ArithmeticException e) 
		{ 
			System.out.println("Division by zero.");
			System.out.println(e);
		}
		System.out.println("This will be executed");
	}	
}
