// WAP to demonstrate generic class
// step-1 define one class which can contain different types of objects
// Syntax : class class_name <Type1, type2...,typen>

class GenericClass <T> {

// Here <T> represent a formal generic type
// Which can be replaced later with an actuall concrete class
// Replacing a generic type is called as a generic instantiation

	T obj;  // obj is a variable of type T which will be defined at compile time

	GenericClass (T ob) {
		
		// initializing value of object ob to obj
		obj = ob; 
	}

	void showType () {
		
		// displaying type of obj
		System.out.println("Type of Object is " + obj.getClass());

	}

}



public class GenericClassDemo {

	public static void main (String[] args) {
		
		// creating integer object of generic class
		GenericClass<Integer> iob = new GenericClass<Integer> (44);
		
		// creating string object of generic class
		GenericClass<String> sob = new GenericClass<String> ("Welcome");

		iob.showType();
		sob.showType();

	}


}

