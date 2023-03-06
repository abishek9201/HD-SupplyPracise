package basics;

public class StringTypes {

	public static void main(String[] args) {
		String name="Abishek";
		System.out.println(name);
		StringBuffer list=new StringBuffer("soaps") ;
		System.out.println(list);
		list.append(" bru");
		System.out.println(list);
		list.append(" first ");
		System.out.println(list.substring(0, 5));
		System.out.println(list);

	}

}
