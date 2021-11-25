
public class Throws {
	public static void divison () throws ArithmeticException
	{
		int x = 5 ;
		int y = 0 ;
		int res = x/y ;
	   
	}
	
	public static void main(String args[])
	{
		try
		{
			divison();
		}
		catch (ArithmeticException e ) {
			System.out.println(e);
			System.out.println(" Rest of the code excuted...");
		}
	}
}


