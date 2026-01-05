class Number{
	public static void isDeficientPerfectAbundant(int n) {
		if(n>0) {
			int s = 0;
			for(int i = 1;i<n;i++) {
				if(n%i==0) {
					s = s+i;
				}
			}
			if(s<n) {
				System.out.println("Deficient Number");
			} 
			if(s==n) {
				System.out.println("Perfect Numberr");
			}
			if(s>n) {
				System.out.println("Abundant number");
			}
		}
		else {
			System.out.println("Invalid number");
		}
	}
}










// WAP to check whether the given number is deficient , Perfect, Abundant

