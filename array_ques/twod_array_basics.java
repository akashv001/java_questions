package array_ques;

public class twod_array_basics {

	public static void main(String[] args) {
//		int[][] arr1;
//		System.out.println(arr1); compiler error as array is not initialised
		
//		int [][] arr=new int [3][3];
		
//		arr[0][0]=2;
//		arr[2][1]=3;
		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
//		int [][] arr= new int[][3];
		
		int [][] arr=new int[3][];
		arr[0]=new int[4];
//		System.out.println(arr[1][2]); it will throw null pointer exception since arr[1]
// is not initialised yet and it contains null.	
		
		arr[1]=new int[1];
		arr[2]=new int[3];
		System.out.println(arr[0]);
		
//		System.out.println(arr[3]);  index out of bound exception
		display(arr);
		
		
	}
	public static void display(int [][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
