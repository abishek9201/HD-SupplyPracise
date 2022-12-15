package keywords;

public class Final1 {
	final int a=12;
	public static void main(String[] args) {
		Final1 f=new Final1();
		System.out.println(f.a);
		//f.a=20;
		f.greet();
	}
	final public void greet() {
		System.out.println("hi");
	}

}
