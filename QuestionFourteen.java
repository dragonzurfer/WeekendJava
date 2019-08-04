package weekendassignment;

import java.util.Scanner;

public class QuestionFourteen {
	public static String validatePassword(String input) {
		boolean echar = false, onenumber = false, spchar = false, alpha = false;
		char[] numbers = {'1','2','3','4','5','6',7,'8','9','0'};
		char[] in = input.toCharArray();
		for(char c: in) {
			for(int i = 0; i < 10; i++) {
				if(c == numbers[i]) onenumber = true;
			}
			if(('a'<=c && c <='b') ||('A'<=c && c <='B') )
				alpha = true;
			else
				spchar = true;
		}
		if(input.length() >= 8) echar = true;
		if(echar && spchar && alpha && onenumber) return "Valid";
		else return "Invalid";
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		System.out.println(validatePassword(in));
	}
}
