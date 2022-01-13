package string_basics;

public class appendString {

	public static void main(String[] args) {
		int s1=100000;
		
		long start=System.currentTimeMillis();
		appendString1(s1);
		long end=System.currentTimeMillis();
		
		System.out.println(end-start);
		
		 start=System.currentTimeMillis();
		appendString2(s1);
		 end=System.currentTimeMillis();
		
		System.out.println(end-start);
		

	}
	
	public static void appendString1(int n) {
		String s1="a";
		for(int i=0;i<=n;i++) {
			s1=s1+i;
			
		}
	}
	
	public static void appendString2(int n) {
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<=n;i++) {
			sb.append(i);
		}
	}

}
