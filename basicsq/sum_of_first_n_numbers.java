package basicsq;

import java.util.Scanner;

public class sum_of_first_n_numbers {

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the number upto which you want to calculate the number");
		
		int n=s.nextInt();
		
		SumN(n);

	}
	
	public static void SumN(int n) {
		int sum=0;
		for(int i=n;i>=1;i--) {
			 sum=sum+i;
			
		}
		System.out.println(sum);
	}

}
