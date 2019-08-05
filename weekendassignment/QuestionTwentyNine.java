package weekendassignment;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
class Pair implements Comparable<Pair>{
    char mark;
    int val;
    
    Pair(char a, int b) {
    	mark = a;
    	val = b;
    }
    
    @Override
    public int compareTo(Pair o) {
        if(mark < o.mark)
        	return -1;
        else if(mark > o.mark)
        	return 1;
        else if(mark == o.mark && val == o.val)
        	return 0;
        return 0;
    }
    
}
public class QuestionTwentyNine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Pair> st = new TreeSet<Pair>();
		while(st.size()!=4) {
			char c = sc.next().charAt(0);
			int val = sc.nextInt();
			Pair np = new Pair(c,val);
			st.add(np);
		}
		for(Pair p : st)
			System.out.println(p.mark+" "+p.val);
	}
}
