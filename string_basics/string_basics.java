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
		
		// indexOf demo
		System.out.println(str.indexOf("el"));
		System.out.println(str.indexOf("El"));
		
		// startsWith demo
		   System.out.println(str.startsWith("Hel"));
           System.out.println(str.startsWith("el"));
           System.out.println(str.startsWith("El"));
           
           System.out.println("_________________________");
           // == and equals demo
           String a1="hello";
           String a2;
           a2=a1;
           String a3="hello";
           String a4;
           a4= new String("hello");
           
           System.out.println((a1==a2)+" , "+a1.equals(a2));
           System.out.println((a1==a3)+" , "+a1.equals(a3));
           System.out.println((a1==a4)+" , "+a1.equals(a4));
           
           
           
           
           
		
		
		
		
		
		

	}

}
