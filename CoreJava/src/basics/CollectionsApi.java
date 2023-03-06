package basics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class CollectionsApi {

	public static void main(String[] args) {
		List<Integer> last=new ArrayList<Integer>();
		//In  Collection 
		last.add(10);
		last.add(20);
		last.add(30);
		last.add(40);
		last.add(50);
		System.out.println(last.get(0));
		System.out.println("---------------------------");
		List<Integer>first=new ArrayList<Integer>();
		first.add(60);
		first.add(70);
		first.add(80);
		first.add(90);
		first.add(100);
		last.addAll(first);
		for(int a:last) {
			System.out.println(a);
		}
		System.out.println("---------------------------");
		Set<Integer>values=new HashSet<Integer>();
		values.add(25);
		values.add(18);
		values.add(75);
		values.add(12);
		values.add(85);
		System.out.println(values);
		for(Integer i:values) {
			System.out.println(i);
		}
		System.out.println("sorted Values");
		Set<Integer>ordervalues=new TreeSet<Integer>();
		ordervalues.addAll(values);
		for(int j:ordervalues) {
			System.out.println(j);
		}
		System.out.println("___________________________________");
		Map<Integer,String>classList=new HashMap<>();
		classList.put(1,"Abi");
		classList.put(2,"Somu");
		classList.put(3,"Chaitu");
		classList.put(4,"babu");
		classList.put(4,"pradeep");
		System.out.println(classList.keySet());
		for(Integer k:classList.keySet()) {
			System.out.println(k+" : "+classList.get(k));
		}
		List<String>names=new ArrayList<String>();
		names.add("Abishek");
		names.add("Chaitu");
		names.add("Somu");
		names.add("vasuRebel");
		Comparator<String>com=new Comparator<String>() {

		@Override
		public int compare(String o1, String o2) {
			if(o1.length()>o2.length()) {
				return 1;
			}
			else {
				return -1;
			}
		}
		};
		
		Collections.sort(names,com);
		System.out.println("___________________________________________");
		for(String abc:names) {
		System.out.println(abc);
		}
		
		
		

	}

}
