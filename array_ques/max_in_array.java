package array_ques;

public class max_in_array {

	public static void main(String[] args) {
		int [] other= {100,800,300,450,710};
		int ans=maxArray(other);
		System.out.println(ans);

	}
	
	
	public static int maxArray(int [] arr) {
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}

}
