package oop25_10;
import java.util.Scanner;
public class password {
public static void main(String[] arg) {
	Scanner id=new Scanner(System.in);
	String username,password;
	System.out.println("enter the username:");
	username=id.nextLine();
	System.out.println("enter the password:");
	password=id.nextLine();
	password="pass123";
	username="user1";
	if(username=="user1") {
		System.out.println("authorized login sucessful");
	}
	else if(password!="pass123") {
		System.out.println("incorrect password");
	}
	else if(username!="user1"&&password=="pass123") {
		System.out.println("user not registered");
	}
	else {
		System.out.println("invalid username and password");
	}
}
}
