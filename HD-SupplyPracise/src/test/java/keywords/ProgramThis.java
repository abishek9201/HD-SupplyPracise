package keywords;

public class ProgramThis {
	int a=10;
	int b=2;
	int c;
	static int d;
	public ProgramThis(int c) {
		this.c=c;
	}
	
	public static void main(String[] args) {
		ProgramThis p1=new ProgramThis(3);
		p1.add(10, 20, 30);
	}
	public void add(int a,int b,int c) {
		System.out.println(this.a+this.b+this.c);
	}
	//we can use this in only non static context
	public void display() {
		System.out.println("I am ProgramThis display");
	}

}
