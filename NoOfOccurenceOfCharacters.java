package strings;

import java.util.HashSet;
import java.util.Scanner;
/**
 * 1. Receive  string from the use
 * 2. Count and print number of occurrences of each character in the string
 * @author shashidhar
 *
 */
public class NoOfOccurenceOfCharacters {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a string");
		String str = s.nextLine();
		int c = 0;
		char[] strArray = str.toCharArray();
		HashSet<Character> st = new HashSet<Character>();
		for(char a : strArray){
			st.add(a);
		}
		for (int i = 0; i < st.size(); i++) {
			for (int j = 0; j < strArray.length; j++) {
				if (strArray[i] == strArray[j]) {
					c++;
				}
			}			
					System.out.printf("%s :", strArray[i]);
					System.out.printf("%d\n", c);
                    c = 0;
		}
	}
}
