package programming;

import java.util.Scanner;

public class Karthik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		System.out.println("enter n");
		int n=sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < n; j++) {
				if(i+j>n-1 || i==n-1) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			for (int j = 0; j < n; j++) {
				if(i>j || i==n-1) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < n; j++) {
				if(j==n/2 && i<n/2 || i==j && i>=n/2 || i==n/4 && j==3*n/4 || j==n-1 && i==n/2) {
					if(i==n/4 && j==3*n/4 || j==n-1 && i==n/2) {
						System.out.print("@");
					}
					else {
						System.out.print("*");
					}
				}
				else {
					System.out.print(" ");
				}
			}
			for (int j = 0; j < n; j++) {
				if(j==n/2 && i<n/2 || i+j==n-1 && i>=n/2 || i==n/4 && j==n/4 || j==0 && i==n/2) {
					if( i==n/4 && j==n/4 || j==0 && i==n/2) {
						System.out.print("@");
					}
					else {
						System.out.print("*");
					}
				}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.print("   ");
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
			for(int j=0;j<n;j++){
				if(j==n/4 ||
				   i==0  && j<=n/2){			//T
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
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
			System.out.println();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i+j>n-1 && i+j<n+n/2-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++) {
				if(i==0 && j<3*n/4-1 || j==0 || j-i==n/2 && i<=n/2) {
				System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++) {
				if(i==0 && j>n/4+1||j==n-1 || i+j==n/2 && i<=n/2 ) {
				System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++) {
				if(i>j && i-j<n/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j>0 && j<n/2 && i<3*n/4) {
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++) {
				if(j==0 || i==n-1) {
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++) {
				if(j==n-1 || i==n-1) {
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++) {
				if(j>n/2 && j<n-1 && i<3*n/4) {
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i+j==n-1 || i==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++) {
				if(i==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++) {
				if( i==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++) {
				if(i==j || i==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<n;j++) {
				if(j>0 && j<n/2) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++) {
				if(j>n/2 && j<n-1) {
				System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		

	}

}
