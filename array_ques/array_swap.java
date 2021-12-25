package array_ques;

public class array_swap {

	public static void main(String[] args) {
		
		int [] arr=new int[5];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=(i+1)*10;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int i=0,j=2;
		
		System.out.println(arr[i]+","+arr[j]);
		swap(arr,i, j);
		System.out.println(arr[i]+","+arr[j]);
		
		int [] other= {100,200,300};
		System.out.println(arr[0]+", "+other[0]);
		swapArr(arr, other);
		System.out.println(arr[0]+", "+other[0]);

	}
	
	public static void swapArr(int [] one, int [] two) {
		int[] temp=new int[1];
		
		temp[0]=one[0];
		one[0]=two[0];
		two[0]=temp[0];
		
		
	}
	
	public static void swap(int[] ans,int one, int two) {
          
          
          int temp=ans[one];
          ans[one]=ans[two];
          ans[two]=temp;
	}

}
