package basicsq;

public class pattern2 {

	public static void main(String[] args) {
		int n=7;
		int nst=n/2;
		int nsp=1;
		
		for(int i=1;i<=7;i++) {
			
			for(int cst=1;cst<=nst;cst++) {
				System.out.print("*");
			}
			
			for(int csp=1;csp<=nsp;csp++) {
				System.out.print(" ");
			}
			
			for(int cst=1;cst<=nst;cst++) {
				System.out.print("*");
			}
			
			if(i<=n/2) {
				nst--;
				nsp=nsp+2;
			}else {
				nst++;
				nsp=nsp-2;
			}
			
			System.out.println();
			
			
		}

	}

}
