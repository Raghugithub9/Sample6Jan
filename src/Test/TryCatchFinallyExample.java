package Test;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		
		
		try {
		System.out.println("Starting of Test Method");
		int a=10;
		int b=a/10;
		System.out.println("Ending of Test Method");
		}
		//catch block will get executed only if try failed
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Catch Block");
		}
		//Finally block will get executed if try failed or passed
		finally{
			System.out.println("Finally Block");
		}
	
	
	
	
	}
}
