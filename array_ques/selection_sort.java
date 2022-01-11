package array_ques;

public class selection_sort {

	public static void main(String[] args) {
		int [] arr= {88,11,44,99,55};
        SelectionSort(arr);
        
        for(int item:arr) {
      	  System.out.println(item);
        }

	}

	public static void SelectionSort(int[] arr) {
		
		for(int counter=0;counter<arr.length-1;counter++) {
			int min=counter;
			for(int j=counter+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			int item=arr[counter];
			arr[counter]=arr[min];
			arr[min]=item;
		}
	}

}
