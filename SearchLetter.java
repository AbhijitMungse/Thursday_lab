package exerciseQue;

public class SearchLetter {
	public static void main(String[] args) {
		// 1st

		String name = "Mumbai";
		if (name.contains("e"))// using .contains to find character
		{
			System.out.println("e is present in mumbai");
		} else {
			System.out.println("e is not present");
		}

		// 2nd

		String str = "I love my india";
		if (str.contains("l")) {
			System.out.println("l is present ");
		} else {
			System.out.println("l is not present");
		}
	}
}
