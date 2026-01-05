class Palindrome{
	public static void palin(int n) {
		int rem = 0;
		int rev = 0;
		for(int t = n;t!=0;t=t/10) {
			rem = t%10;
			rev = (rev*10) + rem;
		}
		if(n==rev) {
			System.out.println("palindrome");
		} else {
			System.out.println("not");
		}
	}
}