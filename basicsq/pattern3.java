package basicsq;

public class pattern3 {

	public static void main(String[] args) {
		
		int nst=1;
		int n=5;
		
		int nsp=n;
		
		int val=1;
		
		for(int i=1;i<=n;i++) {
			
			for(int csp=1;csp<nsp;csp++) {
				System.out.print("\t");
			}
			
			for(int cst=1;cst<=nst;cst++) {
				System.out.print(val+"\t");
				val++;
			}
			
			nst=nst+2;
			nsp--;
			
			
			System.out.println();
			
			
		}

	}

}
