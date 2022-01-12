package string_basics;

public class string_basics {

	public static void main(String[] args) {
		String str="Hello";
		System.out.println(str);
		
//		str="bye";
		System.out.println(str);
		
		System.out.println(str.length());
		
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i)+",");
		}
		
		// substring demo
		System.out.println();
		System.out.println("************");
		System.out.println(str.substring(2,4));
		System.out.println(str.substring(0,str.length()));
		System.out.println(str.substring(2,2));
		System.out.println(str.substring(2,3));
		
		//concat demo
		System.out.println("********");
		String s2="bye";
		
		String s3=str+s2;
		System.out.println(s3);
		
		System.out.println(str.concat(s2));
		
		
		
		

	}

}
