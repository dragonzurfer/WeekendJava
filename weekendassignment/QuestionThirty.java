package weekendassignment;


import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
class Box implements Comparable<Box>{
    int len, width, height,vol;
    
    Box(int l, int w, int h) {
    	len = l;
    	width = w;
    	height = h;
    	vol = l*w*h;
    }
    
    @Override
    public int compareTo(Box o) {
        if(vol == o.vol) return 0;
        return 1;
    }
    
}
public class QuestionThirty {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Box> st  = new TreeSet<Box>();
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int l = sc.nextInt();
			int h = sc.nextInt();
			int w = sc.nextInt();
			st.add(new Box(l,h,w));
		}
		for(Box b : st) {
			System.out.println(b.len+" "+b.height+" "+b.width);
		}
	}
}

