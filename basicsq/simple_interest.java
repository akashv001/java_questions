package basicsq;

import java.util.Scanner;

public class simple_interest {

	public static void main(String[] args) {
		int p=100;
		float r=2;
		float t=1;
		
		float ans=simpleInterest(p, r, t);
		System.out.println(ans);
		
		// Now taking input from user
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the value of principal");
		int p1=s.nextInt();
		
		System.out.println("Enter the value of rate");
		float r1=s.nextFloat();
		
		System.out.println("Enter the value of time");
		float t1=s.nextFloat();
		
		
		float ans1=simpleInterest(p1, r1, t1);
		
		System.out.println("Simple interest will be "+ans1);
		

	}
	
	public static float simpleInterest(int p, float r,float t) {
		float si=(p*r*t)/100;
		
		return si;
	}
	
	
	

}
