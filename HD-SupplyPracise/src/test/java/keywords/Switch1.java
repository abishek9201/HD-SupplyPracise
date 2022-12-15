package keywords;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("Enter a number from 1 to4");
		a=sc.nextInt();
		
		switch(a) {
		case 1:
			System.out.println("one ");
			break;
		case 2:
			System.out.println("Two ");
			break;
		case 3:
			System.out.println("Three ");
			break;
		case 4:
			System.out.println("Four ");
			break;
		default :
			System.out.println("Plese enter valid number ");
		}

	}

}
