package basics;

import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;
public class StreamApi {

	public static void main(String[] args) {
		List<Integer>myList=Arrays.asList(9,4,9,2,6,4,6,4,2,3);
		myList.forEach(n->System.out.println(n));
		Stream<Integer>s1=myList.stream();
		Stream<Integer> s2=s1.filter(n->n%2!=0);
		Stream<Integer> s3=s2.map(n->n*2);
		int s4=s3.reduce(0,(c,e)->c+e);
		System.out.println("____________________________________");
		//s3.forEach(n->System.out.println(n));
		System.out.println(s4);
		System.out.println("____________________________________");
		int s6=myList.stream()
				          .filter(n->n%2==0)
				          .map(n->n*2)
				          .reduce(0,(c,e)->c+e);
		System.out.println(s6);
		System.out.println("____________________________________");
		
	
		

	}

}
