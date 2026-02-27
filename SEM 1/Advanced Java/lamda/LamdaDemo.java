// WAP demonstrate lamda function

// simple greet 
interface Greet {
	void greet();
}

// concationation
interface Concatination {
	void concat(String str1, String str2);
}

// Adding two number
interface addition {
	void add(int a, int b);
}

// tempreture
interface FahrenheitToCelsius {
	void convert(double val);
}

// KM to Mile
interface KmToMile {
	double convert(double val);
}

class LamdaDemo {
	public static void main(String[] args) {
		// simple greet
		Greet gtr = () -> {
			System.out.println("Hello World!!");
		};
		gtr.greet();

		// concationation
		Concatination con = (str1, str2) -> {
			System.out.println("Concatinationed String is : " + str1 + " " + str2);
		};
		con.concat("james", "bond");

		// adding two number
		addition addi = (a, b) -> {
			System.out.println("Addition of two number is : " + (a + b));
		};
		addi.add(2, 3);

		// temperature

		FahrenheitToCelsius temp = (double val) -> {
			System.out.println("Value in Celcius is " + ((val - 32) * 5) / 9);
		};

		temp.convert(33.9);

		// KM to Miles
		KmToMile temp1 = (double val) -> {
			return val * 0.621371;
		};

		System.out.println("Value in Mile is " + temp1.convert(2));

	}

}