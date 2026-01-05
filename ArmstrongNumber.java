class ArmstrongNumber {
	public static void arm(int n) {
		int temp = n;
		int c = 0;
		int sum = 0;

		while(temp>0) {
			c++;
			temp = temp/10;
		}
		temp = n;
		while(temp > 0) {
			int d = temp % 10;
			sum += Math.pow(d,c);
			temp = temp / 10;
		}
		if(sum == n) {
			System.out.println("It is ArmstrongNumber");
		} else{
			System.out.println("It is not ArmstrongNumber");
		}
	}
}