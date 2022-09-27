package week2;

public class FourOperations {

	public int Add(int number1, int number2) {
		return number1 + number2;
	}

	// methodOverloading
	public int Add(int number1, int number2, int number3) {
		return number1 + number2 + number3;
	}

	//
	public int Subtract(int number1, int number2) {
		return number1 - number2;
	}

	public int Multiply(int number1, int number2) {
		return number1 * number2;
	}

	public int Divide(int number1, int number2) {
		return number1 / number2;
	}
}
