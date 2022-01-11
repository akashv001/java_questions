package array_ques;

public class insertion_sort {

	public static void main(String[] args) {
		int [] arr= {88,11,44,99,33};
        InsertionSort(arr);
        
        for(int item:arr) {
      	  System.out.println(item);
        }
	}

	public static void InsertionSort(int[] arr) {
	
		for(int counter=1;counter<arr.length;counter++) {
			int val=arr[counter];
			
		      int j=counter-1;
		      while( j>=0 && arr[j]>val) {
		    	  arr[j+1]=arr[j];
		    	  j--;
		      }
		      
		      arr[j+1]=val;
		}
		
	}

}
