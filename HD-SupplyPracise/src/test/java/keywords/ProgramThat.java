package keywords;

public class ProgramThat extends ProgramThis{

	public ProgramThat(int c) {
		super(c);
	}
	public static void main(String[] args) {
		 new ProgramThat(3).display();
	}
	public void display() {
		System.out.println("I am Program That display");
	}

}
