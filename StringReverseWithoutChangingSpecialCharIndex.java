package strings;

import java.util.Scanner;
/**
 * 1. Receive a sring from user having special characters
 * 2. Reverse string such that special character position won't change but others will change
 * 3. Output such reversed string
 * @author shashidhar
 *
 */
public class StringReverseWithoutChangingSpecialCharIndex {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string including special chacters : ");
		String enteredstring = sc.next();
		StringBuffer strBuff = new StringBuffer(enteredstring);
		StringBuffer revString = strBuff.reverse();
		System.out.println(revString);
		char ch[] = revString.toString().toCharArray();
		int index = 0;
		for(char i : revString.toString().toCharArray()){
			if(!Character.isDigit(i) && !Character.isLetter(i) && !Character.isSpace(i)){
				char temp = ch[index];
				ch[index] = ch[(ch.length-1)-index];
				ch[(ch.length-1)-index] = temp;
			}
			index++;
		}
		System.out.println(ch);
	}
}
