import java.util.*;

public class MapMethodsDemo {
	public static void main(String[] args) {
		// Create a map container

		Map<String, Integer> marks = new HashMap<String, Integer>();
		marks.put("Aakash", 20);
		marks.put("Rohit", 20);
		marks.put("Rishabh", 22);

		System.out.println("Elements in map: " + marks);

		// Find the size of map
		System.out.println("Size of map: " + marks.size());

		// check your map is empty or not
		System.out.println("Is map empty: " + marks.isEmpty());

		// is rohit key is in map
		System.out.println("map contains Rohit key?: " + marks.containsKey("Rohit"));

		// Display only values in map
		System.out.println("Values of map: " + marks.values());

		// Display only keys in map
		System.out.println("Keys of map: " + marks.keySet());

		// remove in map
		System.out.println("value of remove key: " + marks.remove("Rohit"));
		System.out.println("Map: " + marks);

		// get specific key in map
		System.out.println("value of Aakash key: " + marks.get("Aakash"));

		// Restore all the vlaue of marks in marksheet
		Map<String, Integer> marksheet = new HashMap<String, Integer>();
		marksheet.putAll(marks);

		System.out.println(marksheet);

		// clear marks map
		marks.clear();
		System.out.println(marks);

	}
}