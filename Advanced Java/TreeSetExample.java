// WAP to create tree set of integer and display the elements
import java.util.*;

class TreeSetExample {
	public static void main(String[] args){
		// creating tree set object 
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(13);
		ts.add(10);
		ts.add(34);
		ts.add(1);

		// elements will be in sorted manner as tree set sort the elements

		System.out.println(ts);
	}

}