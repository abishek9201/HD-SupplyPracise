package basics;

public class TypeCasting {

	public static void main(String[] args) {
		/*
		 * Casting int a=(int)b explicit conversion
		 * conversion a=b implicit conversion or automatic conversion
		 * */
		byte a=127;
		int b=a;//implicit conversion -- conversion
		System.out.println(b);
		
		
		int c=257;
		byte d=(byte)c; //explicit conversion -- casting
		System.out.println(d);
		
		
		float x=25.673f;
		int y=(int)x;
		System.out.println(y);
		
		
		char e='a';
		e++;
		System.out.println(e);
		
		
		int f=0b101;
		System.out.println(f);	
		
		
		//Type promotion
		byte g=10;
		byte h=30;
		int result=g*h;
		System.out.println(result);
		
		

	}

}
