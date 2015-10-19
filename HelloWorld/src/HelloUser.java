import java.util.Scanner;

public class HelloUser {
	private static String userName;
	
	public static void main(String[] args) {
		System.out.println("Hello ASE2015 - how are you? :)");
		System.out.print("Please enter your name: ");
		
		Scanner kbd = new Scanner(System.in);
		userName = kbd.nextLine();
		
		greetUser();
	}
	
	public static void greetUser(){
		System.out.println("Hello "+userName+"!");
	}
}
