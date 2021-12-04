package basicsq;

import java.util.Scanner;

public class gcd {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Divident");
		int a=s.nextInt();
		
		System.out.println("Enter the Divisor");
		int b=s.nextInt();
		
		int ans=GCD(a, b);
		
		System.out.println(ans);		

	}
	
	public static int GCD(int p, int q) {
	
		int rem=1;
		
		while(p%q !=0) {
			
		    rem=p%q;	
			p=q;
			q=rem;		
			
		}
		
		return q;
		
	}

}