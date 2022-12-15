package keywords;


public class TryCatch {

	public static void main(String[] args) throws ArithmeticException{
		System.out.println("Program Started");
		
		try{
			int a=10;
			int b=0;
			System.out.println(a/b);
		}
		catch(Exception e) {
			System.out.println(e.getLocalizedMessage()+" Error ");
			throw e;
		}
		finally {
			System.out.println("every time i will execute Finally");
		}
		System.out.println("Program Ended");

	}

}
