package strings;

import java.util.Scanner;

/**
 * 1. Receive a string from user
 * 2. Check received string is a substring of existing string
 * @author shashidhar
 *
 */
public class SubstringCheck {

	public static void main(String[] args){
		String main_string = "abcdefxyz";
		System.out.println("Enter the substring to check : ");
		Scanner sc = new Scanner(System.in);
		String substr = sc.next();
		if(main_string.contains(substr)){
			System.out.println("Substring is present");
		}else{
			System.out.println("Substring is not present");
		}
	}
}
