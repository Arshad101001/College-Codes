// WAP to convert fehrenite to celcius

interface converter {
	void convert(double val);

}

class FahrenheiToCelcius {
	public static void main(String[] args) {
		converter temp = (double val) -> {
			System.out.println("Value in Celcius is " + ((val-32)*5) / 9);
		};

		temp.convert(33.9);
	}

}