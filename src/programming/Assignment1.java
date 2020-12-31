package programming;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		System.out.println("enter n value");
		int n=(new Scanner(System.in)).nextInt();		//9
		int count=1;
		
		
/*			1 2 3 4 5 6 7 8 9 
			1 2 3 4 5 6 7 8 
			1 2 3 4 5 6 7 
			1 2 3 4 5 6 
			1 2 3 4 5 
			1 2 3 4 
			1 2 3 
			1 2 
			1
 */
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(j+1+" ");
			}
			System.out.println();
		}
		
/*		01 02 03 04 05 06 07 08 09 
		10 11 12 13 14 15 16 17 
		18 19 20 21 22 23 24 
		25 26 27 28 29 30 
		31 32 33 34 35 
		36 37 38 39 
		40 41 42 
		43 44 
		45 
*/
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				if(count<10) {
					System.out.print(0);
				}
				System.out.print(count++ +" ");
			}
			System.out.println();
		}
		
/*		45 44 43 42 41 40 39 38 37 
		36 35 34 33 32 31 30 29 
		28 27 26 25 24 23 22 
		21 20 19 18 17 16 
		15 14 13 12 11 
		10 09 08 07 
		06 05 04 
		03 02 
		01 
*/
		
		count=n*(n+1)/2;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				if(count<10) {
					System.out.print(0);
				}
				System.out.print(count-- +" ");
			}
			System.out.println();
		}
		
		
/*		01 
		02 03 
		04 05 06 
		07 08 09 10 
		11 12 13 14 15 
		16 17 18 19 20 21 
		22 23 24 25 26 27 28 
		29 30 31 32 33 34 35 36 
		37 38 39 40 41 42 43 44 45 
		45 44 43 42 41 40 39 38 37 
		36 35 34 33 32 31 30 29 
		28 27 26 25 24 23 22 
		21 20 19 18 17 16 
		15 14 13 12 11 
		10 09 08 07 
		06 05 04 
		03 02 
		01 	
*/
		
		count=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				if(count<10) {
					System.out.print(0);
				}
				System.out.print(count++ +" ");
			}
			System.out.println();	
		}
		count--;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				if(count<10) {
					System.out.print(0);
				}
				System.out.print(count-- +" ");
			}
			System.out.println();
		}
		
		
/*		1
		22
		333
		4444
		55555
		666666
		7777777
		88888888
		999999999
		88888888
		7777777
		666666
		55555
		4444
		333
		22
		1
*/
		
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(i+1);
			}
			System.out.println();
		}
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				System.out.print(n-i-1);
			}
			System.out.println();
		}
		
		
/*		1
		22
		333
		4444
		55555
		666666
		7777777
		88888888
		999999999
		999999999
		88888888
		7777777
		666666
		55555
		4444
		333
		22
		1
*/
		
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(i+1);
			}
			System.out.println();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(n-i);
			}
			System.out.println();
		}
		
			
	
	}

}
