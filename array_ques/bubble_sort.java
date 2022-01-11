package array_ques;

public class bubble_sort {

	public static void main(String[] args) {
		int [] arr= {88,66,55,44,22};
          int [] ans=BubbleSort(arr);
          
          for(int item:ans) {
        	  System.out.println(item);
          }
	}
	
	public static int[] BubbleSort(int [] arr) {
		for(int counter=0;counter<arr.length-1;counter++) {
			for(int j=0;j<arr.length-1-counter;j++) {
				if(arr[j]>arr[j+1]) {
					int item=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=item;
				}
			}
		}
		return arr;
	}

}
