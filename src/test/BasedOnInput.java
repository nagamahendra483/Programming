package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BasedOnInput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Input to Print");
		String msg=sc.nextLine().toLowerCase();
		int n=9;
		System.out.println();
		System.out.println();
		List<String> words=nextNum(msg);
		for(int k=0;k<words.size();k++) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<words.get(k).length();j++) {
					printInputCharacter(i,words.get(k).charAt(j),n);
				}
				System.out.println();
			}
			System.out.println();
			System.out.println();
		}
		
	}
	
	public static List<String> nextNum(String msg) {
		List<String> words = new ArrayList<>();
		String[] ar = msg.split(" ");
		String res="";
		for(int i=0;i<ar.length;i++){
			if(ar[i].length()>15){
				System.out.println("word must contain 15 characters");
				System.exit(0);
			}else{
				if((res.length()+ar[i].length())<=15){
					if(i == 0){
						res = ar[i];
						continue;
					}
					res =res+" "+ar[i];
				}else {
					res = addSpaces(res);
					words.add(res);
					res = ar[i];
				}
			}
		}
		if(res.length() != 0){
			words.add(addSpaces(res));
		}
		return words;
	}

	private static String addSpaces(String res) {
		int remainingSpace = 15- res.length();
		String spaces="";
		for(int i=0;i<remainingSpace/2;i++){
			spaces +=" ";
		}
		if(res.length() >= 14 && spaces.length() ==0){
			res =" "+res;
		}
		if(remainingSpace%2 == 0){
			res = spaces+res+spaces+" ";
		}else{
			res = spaces+res+spaces;
		}
		return res;
	}

	public static void printInputCharacter(int i,char a,int n) {
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
