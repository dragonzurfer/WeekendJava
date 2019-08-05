package weekendassignment;
import java.util.*;
public class QuestionThirtyFour {
	public static void rules(){
		System.out.println("1. Insert");
		System.out.println("2. Search");
		System.out.println("3. Delete");
		System.out.println("4. Display");
		System.out.println("5. Exit");
		System.out.println("Enter your choice :");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();

		rules();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while( n != 5){
			switch(n){
				case 1:
					System.out.println("Enter item to insert");
					String str = sc.next();
					list.add(str);
					System.out.println("insert success");
					rules();
					n = sc.nextInt();
					break;
				case 2:
					System.out.println("Enter the item to search :");
					String str2 = sc.next();
					if(list.contains(str2)){
						System.out.println("Item found in the list.");
					}
					else{
						System.out.println("Item not found in the list");
					}
					rules();
					n = sc.nextInt();
					break;
				case 3:
					System.out.println("Enter the item to delete :");
					String str3 = sc.next();
					if(list.contains(str3) == false){
						System.out.println("Item does not exist.");
					}
					else{
						list.remove(str3);
						System.out.println("delete success");
					}
					rules();
					n = sc.nextInt();
					break;
				case 4:
					System.out.println("The Items in the list are :");
					for(String s1:list){
						System.out.println(s1);
					}
					rules();
					n = sc.nextInt();
					break;
				default:
					System.out.println("");
			}
		}
	}
}
