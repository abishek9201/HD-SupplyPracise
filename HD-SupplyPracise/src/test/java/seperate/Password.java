package seperate;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		int upperCount=0;
		int lowerCount=0;
		int digit=0;
		int others=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the password");
		String input=sc.nextLine();
		int inputLen=input.length();
		for(int i=0;i<inputLen;i++) {
			char ch=input.charAt(i);
			if(Character.isUpperCase(ch)) {;
			    upperCount++;}
			    else if (Character.isLowerCase(ch)) {
			    	lowerCount++;}
			    else if(Character.isDigit(ch)) {
			    	digit++;}
			    else {
			    	others++;}
		}
		if(upperCount>=1&&lowerCount>=1&&digit>=1&&others>=1&&inputLen>=8) 
			System.out.println("Password is corect meets all the criteria");
			else if (upperCount<1)
				System.out.println("error please add a UpperCase Letter");
			else if (lowerCount<1)
				System.out.println("error please add a LowerCase Letter");
			else if (digit<1)
				System.out.println("error please add a digit");
			else if (others<1)
				System.out.println("error please add a symbol");
			else if (inputLen<8)
				System.out.println("error please make sure that the lenght of the password is 8 ");
				
			
			
		
		

	}

}
