package keywords;

public class ContinueBreak {

	public static void main(String[] args) {
		int i = 1;
//		while (i <= 10) {
//
//			if (i == 5) {
//				i++;
//				continue;
//			}
//
//			System.out.println("value is " + i);
//			i++;
//
//		}
		while (i <= 10) {

			if (i>5) {
				//i++;
				break;
			}

			System.out.println("value is " + i);
			i++;

		}

	}

}
