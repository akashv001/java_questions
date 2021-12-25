package array_ques;

import java.util.Scanner;

public class array_ops {
	
	static Scanner s=new Scanner(System.in);

	public static void main(String[] args) {
		int[] ans=takeInput();
		display(ans);

	}
	
	public static int[] takeInput() {
		System.out.println("Please enter the size of the array");
		
		int n=s.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<arr.length;i++) {
		  System.out.println("Enter the "+i+" ?index");
		  
		  arr[i]=s.nextInt();
		  
		}
		return arr;
	}
	
	public static void display(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
