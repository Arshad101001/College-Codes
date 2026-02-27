import java.util.*;

public class TestHashSet {
	public static void main(String[] args){
		Set<String> set = new HashSet<>(); // creating empty set

		// Set<String> s = new Set<>(); // error cause Set is an interface and we cant create object of an interface

		set.add("London");
		set.add("Paris");
		set.add("Mumbai");

		// set does not display data in sequence manner
		// set does not accept duplicate elements
		set.add("Mumbai");
		System.out.println(set);

		// set dows not display elements index wise
		//for(int i = 0; i < set.size(); i++) {
		//	System.out.println(set.get(i));
		//}

		List<String> l1 = new LinkedList<>(set);
		for(int i = 0; i < set.size(); i++) {
			System.out.println(i + " " + l1.get(i));
		}
		// System.out.println(l1);

		Set<String> lset = new LinkedHashSet<>(set);
		System.out.println(lset);

		lset.add("Red");
		lset.add("blue");
		lset.add("green");
		System.out.println(lset);
	
	}

}