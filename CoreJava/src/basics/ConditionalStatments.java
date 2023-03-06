package basics;

public class ConditionalStatments {

	public static void main(String[] args) {
		int x=100;
		int y=31;
		int z=35;
		if (x<y && x<z) {
			System.out.println("x is smaller");
			
		}
		else if(y<z ) {
			System.out.println("y is smaller");
		}
		else {
			System.out.println("z is smaller");
		}
		int a=10;
		if(a>5){
			System.out.println(a+" is greater than 5");
		}
		int b=20;
		if (b>10) {
			System.out.println( b +" is gretaer than 10");
		}
		else {
			System.out.println( b +" is less than 10");
		}
		int n=2;
		String result;
		result= (n%2==0)?"even":"odd";//Ternary operator
		System.out.println(result);
		
	}

}
