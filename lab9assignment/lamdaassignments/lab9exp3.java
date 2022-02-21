package lamdaassignments;

import java.util.Scanner;

public class lab9exp3 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter username: ");
	String username1=scan.nextLine();
	System.out.println("enter password: ");
	String password1=scan.nextLine();
	scan.close();
	exp3 verify=((userName,password)->{
		if(userName.equals(username1)&& password.equals(password1))
			return true;
		else
			return false;
	});
	System.out.println(verify.compare("madhu", "mad23"));
}
}
