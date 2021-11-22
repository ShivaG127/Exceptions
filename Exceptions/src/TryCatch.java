
public class TryCatch {
	public static void main(String args[])
	{
		try{int a = 3/0 ;}
		
		catch(ArithmeticException e){System.out.println(e); }
		
		System.out.println("rest of code excuted...");
	}
}
	
	 


