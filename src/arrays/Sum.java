package arrays;

public class Sum {
	public static void main(String[] args) {
		String s="56784";
		//solution(s);
		int n=10;
		int ar[]=new int[n];
		
		System.out.println(fib(n,ar));
	}

	static int fib(int n,int ar[]) {
		// TODO Auto-generated method stub
		if(ar[n]==0) {
			if(n==1 || n==0 || n==2) {
				return 1;
			}
			ar[n]=fib(n-1,ar)+fib(n-2,ar);
		}
		return ar[n];
		
	}

	private static void solution(String s) {
		int sum=0;
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<=i;j++) {
				String s1=s.substring(j,s.length()-i+j);
				System.out.println(s1);
				sum +=Integer.parseInt(s1);
			}	
		}
		/*int sum1=0;
		for (int i = 0; i < s.length() ; i++) {
			for (int j = i ; j < s.length(); j++) {
				String s3 = s.substring(i, j+1);
				System.out.println(s3);
				sum1 +=Integer.parseInt(s3);
			}
		}
		System.out.println(sum1);*/
		
		System.out.println(sum);
		String s2=Integer.toString(sum);
		for(int i=s2.length()-1;i>=0;i--) {
			System.out.print(s2.charAt(i));
		}
	}

}
