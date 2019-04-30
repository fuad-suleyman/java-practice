package day20_forLoop;

public class IndexOf {

	public static void main(String[] args) {

		String word = "amazon";

		int index = -1;
		char letter = 'z';

		for (int i = 0; i < word.length(); i++) {

			if (word.charAt(i) == letter) {

				index = i;
				break;
			}

		}
		System.out.println(index);

	}

}
