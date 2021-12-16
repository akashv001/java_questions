package basicsq;

import java.util.Scanner;

public class finding_table_of_any_num {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the number of which you want to see the table");
		
		int n=s.nextInt();
		
		System.out.println("Please enter the number upto which you want to calculate the table");
		
		int num=s.nextInt();
		
	    printTable(n, num);

	}
	
	public static void printTable(int n,int num) {
		for(int i=1;i<=num;i++) {
			int ans=i*n;
			System.out.println(ans);
		}
		
		
		
	}
	
	
	

}
