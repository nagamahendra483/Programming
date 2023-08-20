package test;

import java.util.Scanner;

public class BasedOnInput {
    private static final String EMPTY = " ";
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Input to Print");
        String msg=sc.nextLine().toLowerCase();
        System.out.println();
        System.out.println();
        String[] s = msg.split(EMPTY);
        StringBuilder res = new StringBuilder();
        for (String value : s) {
            String temp = res + value;
            if (temp.length() > 20) {
                printData(res.toString().trim());
                res = new StringBuilder(value);
            } else {
                res.append(EMPTY).append(value);
            }
        }
        if(res.length() > 0 ) {
            printData(res.toString().trim());
        }
    }
    private static void printData(String message) {
        int n=8;
        for(int i=0;i<n;i++) {
            for(int j=0;j<message.length();j++) {
                if(message.charAt(j) =='.' && i== n-1) {
                    System.out.print("*");
                    continue;
                } else {
                    System.out.print(" ");
                }
                printCharacter(i,message.charAt(j), n);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

    public static void printCharacter(int i,char a, int n) {
		int n=7;
		if(a=='a') {
			for(int j=0;j<n;j++){
				if(j==0 && i!=0 ||
				   j==n/2 && i!=0 ||
				   i==0 && j>0 && j<n/2 ||
				   i==n/2 && j<=n/2){				// A
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
		}else if(a=='b') {
			for(int j=0;j<n;j++){
				if(j==0  ||
				   j==n/2 && i!=0 && i!=n-1 && i!=n/2 ||
				   i==0 && j>0 && j<n/2 ||
				   i==n/2 && j<n/2 ||
					i==n-1 && j<n/2){				//B
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
		}else if(a=='c') {
			for(int j=0;j<n;j++){
				if(j==0 && i!=0 && i!=n-1  ||
				   i==0 && j>0 && j<=n/2 ||
					i==n-1 && j<=n/2 && j!=0){		//C
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
		}else if(a=='d') {
			for(int j=0;j<n;j++){
				if(j==0  ||
				   j==n/2 && i!=0 && i!=n-1  ||
				   i==0 && j>0 && j<n/2 ||
					i==n-1 && j<n/2){				//D
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
		}else if(a=='e') {
			for(int j=0;j<n;j++){
				if(j==0 &&  i!=n-1  ||
				   i==0 && j>0 && j<=n/2 ||
				   i==n/2 && j<=n/2 ||
					i==n-1 && j<=n/2){			//E
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
		}else if(a=='f') {
			for(int j=0;j<n;j++){
				if(j==0 ||
				   i==0 && j>0 && j<=n/2 ||
				   i==n/2 && j<=n/2){			//F
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
		}else if(a=='g') {
			for(int j=0;j<n;j++){
				if(j==0 && i!=0 && i!=n-1
				|| i==0 && j!=0 && j!=n-1
				|| i==n-1 && j<n/2 && j!=0
				|| j==n/2 && i>=n/2 && i!=n-1			//G
				|| i==n/2 && j>=n/2
				|| j==n-1 && i>=n/2
				|| j==n-1 && i!=0 && i<=n/4) {
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			
		}else if(a=='h') {
			for(int j=0;j<n;j++){	
				if(j==0   ||
				   j==n/2 ||
				   i==n/2 && j<=n/2){			//H
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
		}else if(a=='i') {
			for(int j=0;j<n;j++){
				if(j==n/4 ||
				   i==0  && j<=n/2 ||
					i==n-1 && j<=n/2){			//I
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
		}else if(a=='j') {
			for(int j=0;j<n;j++){
				if(j==n/2 && i!=n-1 ||
				   i==0  && j<=n-1
				   || i==n-1 && j<n/2 && j!=0
				   || j==0 && i>n/2
				   || i==n/2 && j<n/4 && j!=0){			//J
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
		}else if(a=='k') {
			for(int j=0;j<n;j++){
				if(j==0  ||
					i+j==n/2 
					|| i-j==n/2){			//K
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
		}else if(a=='l') {
			for(int j=0;j<n;j++){
				if(j==0  ||
					i==n-1 && j<=n/2){			//L
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
		}else if(a=='m') {
			for(int j=0;j<n;j++){
				if(j==0  ||
					j==n-1
					|| i==j && j<=n/2
					|| i+j==n-1 && j>=n/2){			//M
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
		}else if(a=='n') {
			for(int j=0;j<n;j++){
				if(j==0  ||
					j==n-1
					|| i==j){			//N
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
		}else if(a=='o') {
			for(int j=0;j<n;j++){
				if(j==0 && i!=0 && i!=n-1 ||
				   j==n/2 && i!=0 && i!=n-1  ||
				   i==0 && j>0 && j<n/2 ||
					i==n-1 && j>0 && j<n/2){				//O
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
		}else if(a=='p') {
			for(int j=0;j<n;j++){
				if(j==0  ||
				   j==n/2 && i!=0 &&  i<n/2 ||
				   i==0 && j>0 && j<n/2 ||
				   i==n/2 && j<n/2){					//P
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
		}else if(a=='q') {
			for(int j=0;j<n;j++){
				if(j==0 && i!=0 && i<n-2 ||
					i==0 && j!=0 && j<3*n/4 ||
					i==n-2 && j!=0 && j<3*n/4
					|| j==3*n/4 && i!=0 && i<3*n/4
					|| i==j && j>=n/2){			//Q
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
		}else if(a=='r') {
			for(int j=0;j<n;j++){
				if(j==0  ||
				   j==n/2 && i!=0 &&  i<n/2 ||
				   i==0 && j>0 && j<n/2 ||
				   i==n/2 && j<n/2 ||
				   i-j==n/2){					//R
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
		}else if(a=='s') {
			for(int j=0;j<n;j++){
				if(j==0 && i<n/2 && i!=0 ||
				   i==0  && j<=n/2 && j>0 ||
				   i==n/2  && j<n/2 && j!=0||
				   j==n/2 && i>n/2 && i!=n-1 ||
				   i==n-1 && j<n/2){			//S
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
		}else if(a=='t') {
			for(int j=0;j<n;j++){
				if(j==n/4 ||
				   i==0  && j<=n/2){			//T
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
		}else if(a=='u') {
			for(int j=0;j<n;j++){
				if(j==0 && i!=n-1||
				   i==n-1  && j<n/2 && j!=0||
					j==n/2 && i!=n-1){			//U
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
		}else if(a=='v') {
			for(int j=0;j<n;j++){
				if( j==0 && i<n/2 ||
					j==n-1 &&i<n/2 ||
					i-j==n/2 && i>=n/2 ||
					i+j==n+n/2-1 && i>=n/2){			//V
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
		}else if(a=='w') {
			for(int j=0;j<n;j++){
				if(j==0  ||
					j==n-1
					|| i+j==n-1 && i>=n/2
					|| i==j && i>=n/2){			//W
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
		}else if(a=='x'){
			for(int j=0;j<n;j++){
				if(i+j==n-1 ||
					i==j){			//X
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			
		}else if(a=='y') {
			for(int j=0;j<n;j++){
				if(i+j==n-1 && i<n/2 ||
					i==j && i<n/2
					|| j==n/2 && i>=n/2){			//Y
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
		}else if(a=='z'){
			for(int j=0;j<n;j++){
				if(i==0  ||
					i==n-1
					|| i+j==n-1){			//Z
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
		}
		
		if(a=='g' || a=='j'|| a=='m' || a=='n' || a=='q' || (a>='v' && a<='z')) {
			for(int j=0;j<n/2;j++)
			{
				System.out.print(" ");
			}
		}else if(a==' ') {
			System.out.print("     ");
		}
	
	}
}
