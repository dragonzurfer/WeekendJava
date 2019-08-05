package weekendassignment;

import java.util.Scanner;

public class QuestionNine {
	public static String storeMaxVowelWord(String input) {
		String[] words = input.split(" ");
		int ansCnt = 0;
		String ans = "";
		for(String word : words) {
			int cnt = 0;
			for(int i = 0; i <  word.length(); i++) {
				if(word.charAt(i) == 'a'||word.charAt(i) == 'e'||word.charAt(i) == 'i'||word.charAt(i) == 'o'||
						word.charAt(i) == 'u'||word.charAt(i) == 'A'||word.charAt(i) == 'E'||word.charAt(i) == 'I'
						||word.charAt(i) == 'O'||word.charAt(i) == 'U')
					cnt++;
			}
			if(cnt > ansCnt) {
				ans = word;
				ansCnt = cnt;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println(storeMaxVowelWord(input));
	}

}
