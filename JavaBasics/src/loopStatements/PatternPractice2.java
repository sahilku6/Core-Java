package loopStatements;

public class PatternPractice2 {
	public static void main(String[] args) {
		
//		for(int i=1;i<=4;i++) {
//			for(int j=1;j<=4;j++) {
//				if(i==j)
//					System.out.print("*");
//				else 
//					System.out.print(" ");
//			}
//			System.out.println();
//		}
		
//		output 
//		*   
//		 *  
//		  * 
//		   *
		
		
//		for(int i=1;i<=4;i++) {
//			for(int j=1;j<=4;j++) {
//				if(i+j==5)
//					System.out.print("*");
//				else 
//					System.out.print(" ");
//			}
//			System.out.println();
//		}
//		
//		    output
		
//		    *
//		   * 
//		  *  
//		 *     
		
		
//		for(int i=1;i<=4;i++) {
//			for(int j=1;j<=4;j++) {
//				if(i>=j) {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
//		
//		
//		output
//		*
//		**
//		***
//		****
		
//		
//		for(int i=1;i<=4;i++) {
//			for(int j=1;j<=4;j++) {
//				if(i+j>=5) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
//		output
//		
//		    *
//		   **
//		  ***
//		 ****
		
		
//		for(int i=1;i<=4;i++) {
//		for(int j=1;j<=4;j++) {
//			if(i+j<=5) {
//				System.out.print("*");
//			}else {
//				System.out.print(" ");
//			}
//		}
//		System.out.println();
//	}
//		
//		output
//		
//		****
//		*** 
//		**  
//		*
		
		
//		for(int i=1;i<=4;i++) {
//			for(int j=1;j<=4;j++) {
//				if(i<=j) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
//		output
//		****
//		 ***
//		  **
//		   *
		
		
		
//		int num=5;
//		for(int i=1;i<=num;i++) {
//			for(int j=1;j<=num;j++) {
//				if(i==j ||i+j==num+1) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		
		
//		output
		
//		*   *
//		 * * 
//		  *  
//		 * * 
//		*   *
		
		
		// Triangle Pattern (day 2)
		
		
//		int num=4;
//		int n=1;
//		for(int i=1;i<=num;i++) {
//			for(int j=1;j<num*2;j++) {
//				if(i+j>=num+1 && j-i<=num-1) {
//					System.out.print(n);
//					n++;
//				}else {
//					System.out.print(" ");
//				}
//				
//			}
//			n=1;
//			System.out.println();
//		}
		
		
//		output 
//		   	1   
//		   123  
//		  12345 
//		 1234567
		
		
		
//		int num=4;
//		for(int i=1;i<=num;i++) {
//			for(int j=1;j<num*2;j++) {   				
//				if(i<=j && i+j<=num*2) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//		}
		
		
//		output
		
//		*******
//		 ***** 
//		  ***  
//		   * 
		
		
		
//		int num=4;
//		for(int i=1;i<num*2;i++) {
//			for(int j=1;j<=num;j++) {   				
//				if(i>=j && i+j<=num*2) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//		}
		
//		output 
		
//		*   
//		**  
//		*** 
//		****
//		*** 
//		**  
//		*   

		
		
		
//		int num=4;
//		for(int i=1;i<num*2;i++) {
//			for(int j=1;j<=num;j++) {   				
//				if( i+j>=num+1 && i-j<=num-1) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//		}
		
//		output
		
//		   	*
//		   **
//		  ***
//		 ****
//		  ***
//		   **
//		    *
		
		
		
//		int num=4;
//		for(int i=1;i<num*2;i++) {
//			for(int j=1;j<num*2;j++) {   				
//				if( i+j>=num+1 && j-i<=num-1 && i-j<=num-1 && i+j<=(num*3)-1) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//		}
		
		
//		output
		
//		    *   
//		   ***  
//		  ***** 
//		 *******
//		  ***** 
//		   ***  
//		    *   
		
		
		
		
//		int num=4;
//		for(int i=1;i<num*2;i++) {
//			for(int j=1;j<num*2;j++) {   				
//				if( i+j==num+1 || j-i==num-1 || i-j==num-1 || i+j==(num*3)-1) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//		}
//	
		
//		output 
//		
//		   	*   
//		   * *  
//		  *   * 
//		 *     *
//		  *   * 
//		   * *  
//		    *   	
		
		
//		int num=4;
//		for(int i=1;i<=num;i++) {
//			for(int j=1;j<num*2;j++) {   				
//				if( i>=j || i+j>=num*2) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//		}
//	
//		output
		
//		*     *
//		**   **
//		*** ***
//		*******

		
//		int num=4;
//		for(int i=1;i<=num;i++) {
//			for(int j=1;j<num*2;j++) {   				
//				if( i+j<=num+1 || j-i>=num-1) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//		}
	
//		output
//		*******
//		*** ***
//		**   **
//		*     *
		
		
		
		
//		int num=4;
//		for(int i=1;i<num*2;i++) {
//			for(int j=1;j<=num;j++) {   				
//				if(i+j<=num+1 ||i-j>=num-1) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//		}
		
		
//		output
		
//		****
//		*** 
//		**  
//		*   
//		**  
//		*** 
//		****
		
		
		
//		int num=4;
//		for(int i=1;i<num*2;i++) {
//			for(int j=1;j<=num;j++) {   				
//				if(j>=i ||i+j>=num*2) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//		}
//		
//		
//		output
//		
//		****
//		 ***
//		  **
//		   *
//		  **
//		 ***
//		****

		
//		int num=4;
//		for(int i=1;i<num*2;i++) {
//			for(int j=1;j<num*2;j++) {   				
//				if((i>=j && i+j<=num*2) || (i+j>=num*2 && j>=i)) { 
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//		}
		
//		output 
//		*     *
//		**   **
//		*** ***
//		*******
//		*** ***
//		**   **
//		*     *
		
		
		
		int num=4;
		for(int i=1;i<num*2;i++) {
			for(int j=1;j<num*2;j++) {   				
				if(i+j>num+1 && i-j<num-1 && j-i<num-1 && i+j<(num*3)-1 ) { 
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}

		
	}
}
