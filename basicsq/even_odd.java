package basicsq;

import java.util.Scanner;

public class even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s= new Scanner(System.in);
	
	System.out.println("Please Enter the number");
	
	int num=s.nextInt();
	
	EvenOdd(num);
	
	

	}
	
	public static void EvenOdd(int n) {
		
		int ans=n%2;
		
		if(ans==0) {
			System.out.println(+n+": Number is even");
		}else {
			System.out.println(+n+": Number is odd");
		}
		
	}

}
