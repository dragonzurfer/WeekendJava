package weekendassignment;

import java.util.Scanner;

public class QuestionTwentyFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String date = sc.nextLine();
		String[] parts = date.split("-");
		int month = Integer.valueOf(parts[1]);
		int year = Integer.valueOf(parts[2]);
		int ans = 0;
		if(month == 2) {
			ans = 28;
			if(year%100 == 0) {
				if(year%400==0)
					ans = 29;
			} else if(year%4 == 0)
				ans = 29;
		} else {
			int[] daysinmonth = {0,31,30,31,30,31,30,31,31,30,31,30,31};
			ans = daysinmonth[month];
		}
		System.out.println(ans);
		
	}

}
