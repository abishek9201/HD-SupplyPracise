package keywords;

public class CatchTry {

	public static void main(String[] args)throws InterruptedException  {
		System.out.println("program started");
		for(int i=0;i<=5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			finally {
				System.out.println("Finally is being Executed");
			}	
		}
		
		System.out.println("program ended");
	}

}
