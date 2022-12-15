package keywords;

import java.util.Random;

public class StaticDemo {
	static int number;
	public static void main(String[] args) {
		StaticDemo.number=1;
		StaticDemo.number=2;
		StaticDemo.number=new Random().nextInt(100);
		System.out.println(StaticDemo.number);
		StaticDemo.print1();
		print1();
	}
	public static void print1() {
		System.out.println("I am Static Method");
	}
	public  void print2() {
		System.out.println("I am Non-Static Method");
	}

}
