package weekendassignment;

import java.util.Scanner;

public class QuestionFour {
	
	public static int[] generateOddEvenList(int[] a, int[] b, int n) {
		int[] c = new int[n];
		for(int i = 0; i < n; i++) {
			if(i%2 == 0)
				c[i] = b[i];
			else
				c[i] = a[i];
		}
		return c;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n], b = new int[n];
		for(int i = 0;i  < n; i++) 
			a[i] = sc.nextInt();
		for(int i = 0;i  < n; i++) 
			b[i] = sc.nextInt();
		int[] c = generateOddEvenList(a,b,n);
		for(int i = 0; i < n; i++) 
			System.out.print(c[i]+" ");
	}

}
