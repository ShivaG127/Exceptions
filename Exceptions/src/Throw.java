
public class Throw 
{
	public static void validate (int age)
	
	{
		if (age<18)
		{
			throw new ArithmeticException ("person not eligible to vote");
				
}
		
		else {
		System.out.println("person eligible to vote");
		
		}
		
		}
	
	public static void main(String args[])
	{
		validate(15);
		
		System.out.println(" rest of the code excute..");
		}
	}
