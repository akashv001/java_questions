package basicsq;

import java.util.Scanner;

public class fibo_series {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the number upto which fibonaaci need to be calculated");
		
		int n=s.nextInt();
		
		fibo(n);

	}
	
	public static void fibo(int num) {
		int a=0;
		int b=1;
		int sum=0;
		
		for(int i=0;i<num;i++) {
			System.out.print(a+",");
			sum=a+b;
			a=b;
			b=sum;
			
		}
	}

}
