package strings;

import java.util.Scanner;

/**
 * 1. Take two strings as input from user
 * 2. Compare strings and output the result
 * @author shashidhar
 *
 */
public class StringsAreEqual {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string to compare");
		String first = sc.next();
		String second = sc.next();
		if(first.equals(second)){
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are not equal");
		}
	}
}
