package colllectionLearning;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs=new HashSet();
		hs.add(5);
		hs.add(10);
		hs.add(20);
		hs.add(40);
		hs.add(50);
		hs.add(10);
		
		System.out.println(hs);
		
		LinkedHashSet lhs= new LinkedHashSet();
		lhs.add(10);
		lhs.add(5);
		lhs.add(10);
		lhs.add(20);
		lhs.add(40);
		lhs.add(50);
		
		System.out.println(lhs);
		
		
		
		
		
		LinkedList ll= new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(10);
		ll.add(40);
		ll.add(20);
		System.out.println("At first "+ll);
		
		
		
		LinkedHashSet lnl=new LinkedHashSet(ll);
		System.out.println("After duplicates removed "+lnl);
		
		
		
		

	}

}
