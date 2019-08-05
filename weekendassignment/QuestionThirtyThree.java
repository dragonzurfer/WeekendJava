package weekendassignment;

import java.util.Scanner;

public class QuestionThirtyThree {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter binary:");
		String s1 = sc.next();
		System.out.println("Integer value is:" +Integer.parseInt(s1,2));
		System.out.println("Enter octal:");
		String s2 = sc.next();
		System.out.println("Integer value is:" +Integer.parseInt(s2,8));
		System.out.println("Enter hex:");
		String s3 = sc.next();
		System.out.println("I	nteger value is:" +Integer.parseInt(s3,16));
		
	}
}
