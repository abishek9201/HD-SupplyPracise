package seperate;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordRegex {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter the password");
		String input=sc.nextLine();
		Pattern p1=Pattern.compile("((?=.*[0-9])(?=.*[#$@%])(?=.*[a-z])(?=.*[A-Z])).{8,20}");
		Matcher m1=p1.matcher(input);
		Pattern p2=Pattern.compile("(?=.*[A-Z]).{1,}");
		Matcher m2=p2.matcher(input);
		Pattern p3=Pattern.compile("(?=.*[a-z]).{1,}");
		Matcher m3=p3.matcher(input);
		Pattern p4=Pattern.compile("(?=.*[#$@%]).{1,}");
		Matcher m4=p4.matcher(input);
		Pattern p5=Pattern.compile("(?=.*[0-9]).{1,}");
		Matcher m5=p5.matcher(input);
		boolean b1=m1.matches();
		if(b1) {
			System.out.println("Correct Password");
		}
		else {
			System.out.println("Please choose a stronger password. Try a mix of letters, numbers and symbols.");
		}
		boolean b2=m2.matches();
		if(b2) {
			System.out.println("it has lowerCase Letters");
		}
		else {
			System.out.println("it doesn't have LowerCase Letters");
		}
		boolean b3=m3.matches();
		if(b3) {
			System.out.println("it has UpperCase Letters");
		}
		else {
			System.out.println("it doesn't have UpperCase Letters");
		}
		boolean b4=m4.matches();
		if(b4) {
			System.out.println("it has Symbols ");
		}
		else {
			System.out.println("it doesn't have Symbols");
		}
		boolean b5=m5.matches();
		if(b5) {
			System.out.println("it has Numeric values");
		}
		else {
			System.out.println("it doesn't have Numerics");
		}

	}

}
