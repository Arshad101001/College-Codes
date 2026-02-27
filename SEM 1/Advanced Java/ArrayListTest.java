import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// create one empty array list
		ArrayList<Integer> list = new ArrayList<>();

		// adding values to the list
		list.add(10);
		list.add(20);
		// list.add("Mumbai"); // it will give error

		System.out.println(list);

		// find the object at index 0
		System.out.println("First element: " + list.get(0));

		// adding value at specific index
		list.add(0, 5);
		System.out.println(list);

		list.add(3, 30);
		System.out.println(list);

		// display the size of the array
		System.out.println("The size of the list is: " + list.size());

		// getting if the lsit contains the value
		System.out.println("Does list contain 20: " + list.contains(20));

		// create a arrayList with specified size;
		ArrayList<Integer> list1 = new ArrayList<>(5);
		list1.add(115);

		// triming the size of the arrayList
		System.out.println("The size of the array list before trim is: " + list1.size());
		list.trimToSize();
		System.out.println("The size of the array list after trim is: " + list1.size());

		// find the specific index of a object
		System.out.println("Index of 20 in list is : " + list.indexOf(20));

		// set method Replaces the element at the specified position in the list with the specified element.
		list.set(0, 122);
		System.out.println("List after set method is " + list);

		// create new array list by passing existing list or siply copying list into another list
		ArrayList<Integer> list2 = new ArrayList<>(list);
		System.out.println("Values of list2 is: " + list2);

		// remove specific index
		list2.remove(0);
		System.out.println("List2 after removal of 0 index: " + list2);

		// clearing the list
		list2.clear();
		System.out.println("List2 after clearence of list2: " + list2);

	}

}