package array_ques;

public class array_basics {

	public static void main(String[] args) {
		
		int [] arr=null;
		System.out.println(arr);
		
		arr=new int[5];
		System.out.println(arr);
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=i*12;
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		for(int val:arr) {
			System.out.print(val+" ");
		}
		
		

	}

}
