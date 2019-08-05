package weekendassignment;

import java.util.*;

class UserMainCode17{
	static int findMaxDistance(int[] a){
		int index=0;
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<a.length-1;i++){
			if(a[i] > a[i+1]){
				if(map.containsKey(i)){
					map.put(i, Math.max(map.get(i), a[i+1]-a[i]));
				}
				else{
					map.put(i, a[i+1]-a[i]);
				}
				
			}
			else{
				if(map.containsKey(i+1)){
					map.put(i+1, Math.max(map.get(i+1), a[i+1]-a[i]));
				}
				else{
					map.put(i+1, a[i+1]-a[i]);
				}
				
			}
			
		}
		int max =0;
		for(int x:map.keySet()){
			max = Math.max(max, map.get(x));
		}
	
		for(int x:map.keySet()){
			if(max == map.get(x)){
				index = x;
			}
		}
		return index;
	}
}

public class QuestionSeventeen {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		System.out.println(UserMainCode17.findMaxDistance(a));
	}
}
