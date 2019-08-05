package weekendassignment;

import java.util.Scanner;

public class QuestionNineteen {
	public static String getLastLetter(String input) {
		String ans = "";
		String[] words = input.split(" ");
		for(String word : words) {
			ans += "$"+word.charAt(word.length()-1);
		}
		String ans2 = ans.substring(1);
		return ans2;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		System.out.println(getLastLetter(in));
	}
}
