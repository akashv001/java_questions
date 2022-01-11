package array_ques;

import java.util.Scanner;

public class linear_search {

	public static void main(String[] args) {
		int [] arr= {12,45,38,21,19};
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the element you want to search");
		int num=s.nextInt();
		
		int ans=LinearSearch(arr, num);
		System.out.println(ans);

	}
	
	public static int LinearSearch(int [] arr,int item) {
		
       for(int i=0;i<arr.length;i++) {
    	   if(arr[i]== item) {
    		   return i;
    	   }
       }
       
       return -1;
       
       }
	}


