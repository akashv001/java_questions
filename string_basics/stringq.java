package string_basics;

import java.util.Scanner;

public class stringq {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Please enter the string");
		String str=s.next();
		
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
		
	}

}
