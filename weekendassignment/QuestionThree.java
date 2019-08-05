package weekendassignment;
class UserMainCode3{
	static int countNoOfWords(String s1,String s2){
		String[] splitStr2 = s2.trim().split("\\s+");
		String[] splitStr1 = s1.trim().split("\\s+");
		int mycount=0;
		for(int i=0;i<splitStr1.length;i++){
			if(splitStr1[i].equals(splitStr2[1])){
				mycount++;
			}
		}
		return mycount;
	}
}
public class QuestionThree {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(UserMainCode3.countNoOfWords("abc bcd abc bcd abc abc", "av abc"));
	}
}
