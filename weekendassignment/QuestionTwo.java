package weekendassignment;

import java.util.*;
class UserMainCode2{
	static int addUniqueEven(int[] a){
		HashMap<Integer,Boolean> map = new HashMap<>();
		for(int i=0;i<a.length;i++){
				map.put(a[i],false);
			
		}
		int evensum =0;
		for(int i=0;i<a.length;i++){
			if(!map.get(a[i]) && a[i]%2==0){
				evensum += a[i];
				map.put(a[i], true);
			}
		}
		return evensum;
	}
}


public class QuestionTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] a = {4,2,5,1,4};
			int res = UserMainCode2.addUniqueEven(a);
			if(res ==0){
				System.out.println("no even numbers");
			}
			else{
				System.out.println(res);
			}
			
		}
	}

}
