package keywords;

public class SD2 {
	static int number;
	static {
		System.out.println("In Static block 1");
		number=1;
	}
	static {
		System.out.println("In Static block 2");
		number=2;
	}
	static {
		System.out.println("In Static block 3");
		number=3;
	}
	{
		System.out.println("In Non-Static block 1");
	}

	public static void main(String[] args) {
		//System.out.println(StaticDemo.number);
		StaticDemo.print1();
		StaticDemo s1=new StaticDemo();
		s1.print2();
		s1.print1();
		
		System.out.println(SD2.number);
		new SD2();

	}

}
