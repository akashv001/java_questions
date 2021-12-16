package basicsq;

public class pattern4 {

	public static void main(String[] args) {
		int n=5;
		
		int nst=1;
		
		int val=1;
		int nsp=1;
		
		for(int row=0;row<2*n-1;row++) {
			
			for(int num=0;num<nst;num++) {
				if(num%2==0) {
					System.out.print(val);
					
				}else {
					System.out.print("*");
				}
				
				
			}
			if(row<n-1) {
				nst=nst+2;
				val++;
				
			}else {
				nst=nst-2;
				val--;
			}
			System.out.println();
						
		}

	}

}
