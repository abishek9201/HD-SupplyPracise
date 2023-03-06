package basics;

abstract class Computer {
	public abstract void run();
}
class Laptop extends Computer {
	public void run() {
		System.out.println("Developing in laptop");
	}
}
class Desktop extends Computer {
	public void run() {
		System.out.println("Developing in Desktop ");
	}
}
class Developer{
	public void Devapp(Computer com) {
		com.run();
	}
}
public class Demo {

	public static void main(String[] args) {
		Developer abi=new Developer();
		Computer lap =new Laptop();
		Computer desk=new Desktop();
		abi.Devapp(desk);
		abi.Devapp(lap);
	
		

	}

}
