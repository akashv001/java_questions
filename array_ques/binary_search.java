package array_ques;

import java.util.Scanner;

public class binary_search {

	public static void main(String[] args) {
        int [] arr= {5,7,10,12,15,20,27,31,36,42,55,58,60,65};
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the element you want to search");
		int num=s.nextInt();
		
		int ans=BinarySearch(arr, num);
		System.out.println(ans);
		
	}
	
	public static int BinarySearch(int [] arr, int item) {
		
		int lo=0;
		int hi=arr.length-1;
			
		while(lo<=hi) {
			
			int mid=(lo+hi)/2;
			
			if(item > arr[mid]) {
				lo=mid+1;
			}else if(item < arr[mid]){
				hi=mid-1;
			}else {
				return mid;
			}
		}
		
		return -1;
		
	}

}
