package array_ques;

import java.util.Scanner;

public class takeInput {

	static Scanner s=new Scanner(System.in);
	
	public static void main(String[] args) {
	  int[][] ans=takeInput();
	  display(ans);
	  
	}
	
	public static int[][] takeInput(){
	  System.out.println("Please Enter the number of rows");
	  
	  int row=s.nextInt();
	  
	  int[][] arr=new int[row][];
	  
	  for(int i=0;i<arr.length;i++) {
		System.out.println("Please Enter the number of columns for "+i+" index");  
		int col=s.nextInt();
		
		arr[i]=new int[col];
		
		for(int j=0;j<arr[i].length;j++) {
			System.out.println("Please enter the elements for "+i+j+" index");
			arr[i][j]=s.nextInt();
		}
	  }
	  
	  return arr;
	  
	   
	   
	}
	
	public static void display(int[][]arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
