package basicsq;

import java.util.Scanner;

public class prime_number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Please Enter the number");
		int n=s.nextInt();
		
		prime(n);

	}
	
	public static void prime(int n) {
		
		boolean flag=false;
		
		for(int i=n-1;i>1;i--) {
			
			if(n%i==0) {
				flag=true;
			}
		}
			
			if(flag==true) {
				System.out.println("Entered number is not prime");
			}else {
				System.out.println("Entered number is prime");
			}
			
		
		
	}

}
