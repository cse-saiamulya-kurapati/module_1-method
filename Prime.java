class Prime{
	public static void prime(int n) {
		int c = 0;
		for(int i = 1;i<=n;i++) {
			if(n%i==0) {
				c++;
			}
		}
		if(c==2) {
			System.out.println("prime");
		}
		 else{
		 	System.out.println("Not prime");
		 }
	}
}