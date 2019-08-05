package weekendassignment;

import java.util.Scanner;

class Employee{
	
	private String fname;
	private String lname;
	private String mob;
	private String email;
	Employee(String fname,String lname,String mob,String email){
		this.fname = fname;
		this.lname = lname;
		this.mob = mob;
		this.email = email;
	}
	public String getname(){
		return fname;
	}
	public String getlname(){
		return lname;
	}
	public String getmob(){
		return mob;
	}
	public String getemail(){
		return email;
	}

}

public class QuestionTwentyEight {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of employees");
		int n = sc.nextInt();
		Employee[] cls = new Employee[n];
	
		for(int i=0;i<n;i++){
			System.out.println("Enter details of employee" +i);
			System.out.println("Enter firstname:");
			String fname = sc.next();
			System.out.println("Enter lastname:");
			String lname = sc.next();
			System.out.println("Enter mobile:");
			String mob = sc.next();
			System.out.println("Enter email:");
			String email = sc.next();
			Employee emp = new Employee(fname,lname,mob,email);
			cls[i] = emp;
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(cls[i].getname().compareTo(cls[j].getname()) >0){
					Employee e = cls[i];
					cls[i] = cls[j];
					cls[j] = e;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.println("employee" +i);
			System.out.println("firstname: " +cls[i].getname());
			System.out.println("lastname: " +cls[i].getlname());
			System.out.println("mob: " +cls[i].getmob());
			System.out.println("email: " +cls[i].getemail());
		}
		
	}
}
