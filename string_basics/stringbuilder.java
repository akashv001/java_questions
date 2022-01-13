package string_basics;

import java.util.Scanner;

public class stringbuilder {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		String str=s.nextLine();
		
		StringBuilder sb=new StringBuilder(str);
		System.out.println(sb);
		System.out.println(sb.length());
		
		//append
		sb.append("abc");
		System.out.println(sb);
		
		//insert
		sb.insert(2, "def");
		System.out.println(sb);
		
		sb.insert(1, "b");
		System.out.println(sb);
		
		sb.insert(sb.length(), "b");
		System.out.println(sb);
		
		//delete
		sb.deleteCharAt(3);
		System.out.println(sb);
		
		// update
		sb.setCharAt(2, 'a');
		System.out.println(sb);
		
		// string conversion to string builder
		String s1=sb.toString();
		System.out.println(s1);
		
	}

}
