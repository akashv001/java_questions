package basicsq;

import java.util.Scanner;

public class sum_of_first_n_natural_number {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the number upto which sum need to be calculated");
		
		int n=s.nextInt();
		
		int ans=SumNatural(n);
		System.out.println(ans);
		

	}
	
	public static int SumNatural(int n) {
		int ans=0;
		
		for(int i=1;i<=n;i++) {
			ans=ans+i;
		}
		
		return ans;
		
	}

}
