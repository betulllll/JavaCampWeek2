package week2;

public class Methods {

	public static void main(String[] args) {

		findNumber();

	}

	public static void findNumber() {
		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };

		int find = 9;
		boolean isThere = false;

		for (int number : numbers) {
			if (number == find) {
				isThere = true;
				break;
			}
		}
		if (isThere)
			giveMessage("This number is in the array: " + find);
		else
			giveMessage("This number is NOT in the array: " + find);

	}

	public static void giveMessage(String message) {
		System.out.println(message);
	}

}
