package keywords;

public class breakConinue {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i==5) {
				System.out.println("Value "+i+" is skipped");
				continue;
			}
//			if(i>5) {
//				System.out.println("execution is stopped");
//				break;
//			}
			System.out.println("Value is "+i);
		}

	}

}
