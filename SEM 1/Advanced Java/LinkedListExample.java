// Create a linkedList add few elemnts. display the elements in reverse order

import java.util.*;

class LinkedListExample {
	public static void main(String[] args) {
		
		LinkedList<Integer> l1 = new LinkedList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		System.out.println(l1);

		// Getting elements by using for loop
		System.out.println("Printing elements in reverse order by using for loop : ");
		for(int i = l1.size() - 1; i >= 0; i--){
			System.out.print(l1.get(i) + " ");
		}
		System.out.println();
		
		// Getting Elements by traversing with list iterator
		System.out.println("Display list elements in reverse order with the help of list iterator : ");
		ListIterator<Integer> itr = l1.listIterator(l1.size());

		while(itr.hasPrevious()) {
			System.out.print(itr.previous() + " ");
		}

		// getting elements using for each loop
		System.out.println("\nDisplay Elements using for each loop");
		for (int a : l1){
			System.out.print(a  + " ");
		}
		System.out.println();
	}
}