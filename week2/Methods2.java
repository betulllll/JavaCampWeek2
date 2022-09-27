package week2;

public class Methods2 {

	public static void main(String[] args) {

		String newMessage = giveCity();
		System.out.println(newMessage);
		int number = sum(15, 7);
		System.out.println(number);
		int total = sum2(2, 3, 4, 5, 6, 10);
		System.out.println(total);
	}

	public static void add() {
		System.out.println("It's added");
	}

	public static void delete() {

		System.out.println("It's deleted");
	}

	public static void update() {
		System.out.println("It's updated");
	}

	public static int sum(int number1, int number2) {
		return number1 + number2;
	}

	public static int sum2(int... numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}

	public static String giveCity() {
		return "Ankara";
	}

}
