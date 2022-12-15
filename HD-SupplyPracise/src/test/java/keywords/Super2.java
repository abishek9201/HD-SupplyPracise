package keywords;

public class Super2 extends Super1{
	int x=30;
	public Super2(String msg){
		super(msg);
		System.out.println("I am constructor of super 2");
	}
	public void show() {
		int x=20;
		System.out.println(super.x);
		System.out.println(x);
		System.out.println(this.x);
	}
	public void hi() {
		super.hi();
		System.out.println(" hi from child ");
	}

	public static void main(String[] args) {
		Super2 s2=new Super2("Hello super");
		s2.show();
		s2.hi();

	}

}
