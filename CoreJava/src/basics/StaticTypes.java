package basics;

public class StaticTypes {
	static String name;
	int price;
	StaticTypes(int price){
		this.price=price;
	System.out.println("I am constrctor");	
	}
	
	static {
		name="Iphone";
		System.out.println("i am block");
	}

	public static void main(String[] args) {
		StaticTypes st=new StaticTypes(69000);
		System.out.println(StaticTypes.name);
		System.out.println(st.price);

	}

}
