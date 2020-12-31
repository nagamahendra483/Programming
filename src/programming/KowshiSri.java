package programming;




class KowshiSri {
	public static void main(String[] args) throws Exception {
//		Scanner sc = new Scanner(System.in); 
//		System.out.println("enter n");
//		int n=sc.nextInt();
		int n=7;
		System.out.println();
		System.out.println();
		// 1st
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

			System.out.print("          ");
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
			
			for(int j=0;j<n/2;j++)
			{
				System.out.print(" ");
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

			System.out.print("      ");
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
			
			for(int j=0;j<n/2;j++)
			{
				System.out.print(" ");
			}

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
			System.out.print("    ");
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
			System.out.print("    ");

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
			for(int j=0;j<n/2;j++)
			{
				System.out.print(" ");
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
					j==n-1
					|| i==j){			//N
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			
			for(int j=0;j<n/2;j++)
			{
				System.out.print(" ");
			}

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
			
			System.out.print("       ");
			
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
			
			for(int j=0;j<n/2;j++)
			{
				System.out.print(" ");
			}

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

			


			Thread.sleep(1000);
			System.out.println();
		}
		// 2nd 
		
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

			

			Thread.sleep(1000);
			System.out.println();
		}
		
		// 3rd 
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
			
			

			System.out.print("          ");

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
				   i==n/2 && j<n/2){					//P
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
				   i==n/2 && j<n/2){					//P
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}

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

			System.out.print("       ");
			
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
				if(j==0 && i!=n-1||
				   i==n-1  && j<n/2 && j!=0||
					j==n/2 && i!=n-1){			//U
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
				if(j==0  ||
					j==n-1
					|| i==j){			//N
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			
			for(int j=0;j<n/2;j++)
			{
				System.out.print(" ");
			}


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
			
			System.out.print("      ");
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
			System.out.print("    ");

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

			Thread.sleep(1000);
			System.out.println();
		}
		
		// 4th
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

			Thread.sleep(1000);
			System.out.println();
		}
		
		//5th
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
			


			System.out.print("                 ");
			

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
				if(i+j==n-1 && i<n/2 ||
					i==j && i<n/2
					|| j==n/2 && i>=n/2){			//Y
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}

			System.out.print("        ");


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
			
			for(int j=0;j<n/2;j++)
			{
				System.out.print(" ");
			}
			
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
			
			for(int j=0;j<n/2;j++)
			{
				System.out.print(" ");
			}
			
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




			Thread.sleep(1000);
			System.out.println();
		}
		
		//6th
		
		for(int i=0;i<n-3;i++) {
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
			
			
			
			Thread.sleep(1000);
			System.out.println();
		}
	}

}
