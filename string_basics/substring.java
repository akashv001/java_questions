package string_basics;

public class substring {

	public static void main(String[] args) {
		String str = "abcd";
		Substring(str);

	}
	
	public static void Substring(String str) {
		
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				System.out.print(str.substring(i, j)+" ,");
				
			}
		}
	}

}
