package weekendassignment;

import java.util.*;
class UserMainCode12{
	static String getWordWithMaximumVowels(String s1){
		String[] splitStr = s1.trim().split("\\s+");
		HashMap<String,Integer> map = new HashMap<>();
		for(String temp:splitStr){
			map.put(temp, 0);
			for(int i=0;i<temp.length();i++){
				if(temp.charAt(i)=='a' || temp.charAt(i)=='e' || temp.charAt(i)=='i' || temp.charAt(i)=='o' || temp.charAt(i)=='u'){
					map.put(temp, map.get(temp)+1);
				}
			}
		}
		int max = 0;
		for(String s:map.keySet()){
			max = Math.max(max, map.get(s));
		}
		String word = "";
		for(String s:map.keySet()){
			if(map.get(s) == max){
				word = s;
			}
		}
		return word;
	}
}

public class QuestionTwelve {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String st1 = sc.nextLine();
		System.out.println(UserMainCode12.getWordWithMaximumVowels(st1));

	}
}
