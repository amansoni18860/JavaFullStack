package lect_e_Predefined_Functional_Interface.Predicates;

import java.util.Scanner;
import java.util.function.Predicate;

class User{
	String Username;
	String Password;
	
	User(String username,String password){
		this.Username=username;
		this.Password=password;
		
	}
}
public class PredicateExample {

	public static void main(String[]args) {
		
		Predicate<User>p=u->u.Username.equals("Aman") && u.Password.equals("pass1234");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Username : ");
		String username=sc.nextLine();
		
		System.out.println("Enter Password : ");
		String password=sc.next();
		
		User user=new User(username,password);
		
		if(p.test(user)) {
			System.out.println("Status: 200 Authorized Success !");
		}else {
			System.out.println("Status: 401 Unauthorized Access !");
		}
	}
}
