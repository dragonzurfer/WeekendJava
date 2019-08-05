package weekendassignment;

import java.util.HashMap;
import java.util.Scanner;
import java.util.*;
import java.text.SimpleDateFormat;
import static java.util.Calendar.*;

class UserMainCode4{
	public static Calendar getCalendar(Date date) {
	    Calendar cal = Calendar.getInstance(Locale.US);
	    cal.setTime(date);
	    return cal;
	}
	static ArrayList<String> retirementEmployeeList(HashMap<String,String> map) throws Exception{
		ArrayList<String> res = new ArrayList<String>();
		Date curr = new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2014");
		for(String id : map.keySet()){
			String s1 = map.get(id);
			Date birth=new SimpleDateFormat("dd/MM/yyyy").parse(s1);
			Calendar a = getCalendar(birth);
		    Calendar b = getCalendar(curr);
		    int diff = b.get(YEAR) - a.get(YEAR);
		    if (a.get(MONTH) > b.get(MONTH) || 
		            (a.get(MONTH) == b.get(MONTH) && a.get(DATE) > b.get(DATE))) {
		            diff--;
		        }
		    if(diff >= 60){
		    	res.add(id);
		    }
		}
		return res;
	}
}

public class QuesetionFour {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<String,String> map = new HashMap<>();
		int n = sc.nextInt();
		while(n >0){
			String id = sc.nextLine();
			String dob = sc.nextLine();
			map.put(id, dob);
			n--;
		}
		ArrayList<String> emp = UserMainCode4.retirementEmployeeList(map);
		for (String id : emp) {
		    System.out.print(id);
		}
	
	}
}
