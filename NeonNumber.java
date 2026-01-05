class NeonNumber{
	public static void main(String[] args) {
		int n = 9;
		int temp = n*n;
		int sum = 0;
		while(temp>0) {
			sum += temp % 10;
			temp = temp/10;

		}
		if(sum == n) {
			System.out.println("It is Neon Number");
		}
		 else{
		 	System.out.println("It is not");
		 }
	}
}