package basicsq;

import java.util.Scanner;

public class reverse_num {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		
		int ans=reverse(n);
		System.out.println(ans);
		

	}
	// 347 == 743
	
	public static int reverse(int num) {
		int ans=0;
		while(num%10!=0) {
			int rem=num%10;
			ans=ans*10+rem;
			num=num/10;
		}
		
		return ans;
	}

}
