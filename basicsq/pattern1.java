package basicsq;

import java.util.Scanner;

public class pattern1 {

	public static void main(String[] args) {
		
        int n=5;
        int nst=1;
        int nsp=n;
        
        for(int i=1;i<=2*n-1;i++) {
        	
        	for(int cst=1;cst<=nst;cst++) {
        		System.out.print("*");
        	}
        	
        	for(int csp=1;csp<nsp;csp++) {
        		System.out.print(" ");
        	}
        	
        	if(i<n) {
        		nst++;
        		nsp--;
        		
        	}else {
        		nst--;
        		nsp++;
        	}
        	
        	System.out.println();
        	
        	
        }
        
	}

}
