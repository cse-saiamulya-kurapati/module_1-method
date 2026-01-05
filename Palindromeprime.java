class Palindromeprime{
	public static boolean isPrime(int n) {
         if(n<=1) {
         	return false;
         }
         for(int i = 2;i<=n/2;i++) {
         	if(n%i==0) {
         		return false;
         	}
         	return true;
         }
	}

	public static boolean isPalindrome(int n) {
		int temp = n;
		int rev = 0;
		while(temp>0) {
			rev = (rev*10) + temp%10;
            temp = temp/10;
		} return (rev==n);
	}

	public static boolean isPalindromePrime(int n ) {
		if(isPrime(n) && isPalindrome(n)) 
			return true;
		else {
			return false;
		}
	}
}