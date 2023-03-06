package basics;

public class Operators {

	public static void main(String[] args) {
		/*
		 * Unary operator
		 * Shift operator
		 * Arithmetic operator
		 * Relational operator
		 * Logical operator
		 * Bitwise operator
		 * Assignment operator
		 * Ternary operator
		 * */
		System.out.println("Arithmetic operator");
		System.out.println("-------------------------------------------");
	
		//Arithmetic operator +,-,*,/,%
		int num1=20;
		int num2=10;
		System.out.println("Addition = "+(num1+num2));
		System.out.println("Substraction = "+(num1-num2));
		System.out.println("Multiplication = "+(num1*num2));
		System.out.println("Division = "+(num1/num2));
		System.out.println("Modulus = "+(num1%num2));
		System.out.println("-------------------------------------------");
		System.out.println("Assignment operator");
		System.out.println("-------------------------------------------");
		
		//Assignment operator +=,-=,*=,/=,%=,==
		int a=20;
		System.out.println("Addition = "+(a+=10));//a=a+10;
		System.out.println("Substraction = "+(a-=10));
		System.out.println("Multiplication = "+(a*=10));
		System.out.println("Division = "+(a/=10));
		System.out.println("Modulus = "+(a%=10));
		System.out.println(a==12);
		System.out.println("-------------------------------------------");
		System.out.println("Relational operators");
		System.out.println("-------------------------------------------");
		
		//Relational operators <,<=,>,>=,==,!=
		int val1=12;
		int val2=13;
		System.out.println("12<13 "+(val1<val2));
		System.out.println("12<=13 "+(val1<=val2));
		System.out.println("12>13 "+(val1>val2));
		System.out.println("12>=13 "+(val1>=val2));
		System.out.println("12==13 "+(val1==val2));
		System.out.println("12!=13 "+(val1!=val2));
		System.out.println("-------------------------------------------");
		System.out.println("Bitwise and logical operators");
		System.out.println("-------------------------------------------");
		int p=10;
		int q=20;
		boolean res=p>q && p<q; //checks only the first condition if it is false it returns false
		System.out.println(res);
		boolean res1=p>q || p<q; //check first condition if it is true it returns true without checking second condition
		System.out.println(res1);
		boolean res2=p>q & p<q; //checks both the conditions
		System.out.println(res2);
		boolean res3=p>q | p<q; //checks both the conditions 
		System.out.println(res3);
		boolean res4=p>q ^ p<q;
		System.out.println(res4);
		boolean res5=!(p>q) ;
		System.out.println(res5);
		System.out.println("-------------------------------------------");
		
		
		

	}

}
