package basicsq;

import java.util.Scanner;

public class fibonaaci_series {

	public static void main(String[] args) {
	
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the number upto which you want to calculate the fibo");
		
		int n=s.nextInt();
		
		int[] ans=Fibo(n);
		
		display(ans);

	}
	
	public static void display(int[] ans) {
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+",");
		}
		
	}

	public static int[] Fibo(int n) {
		int a=0;
		int b=1;
		int sum=0;
		
		int [] ans=new int[n];
		
		for(int i=0;i<=n-1;i++) {
			sum=a+b;
			ans[i]=a;
			a=b;
			b=sum;
		}
		
		return ans;
	}

}
