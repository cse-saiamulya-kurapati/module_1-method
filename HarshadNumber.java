class HarshadNumber{
	public static void main(String[] args) {
	   int n = 12;
	   int temp = n;
	   int sum = 0;
	   while(temp>0) {
	   	 sum += temp%10;
	   	 temp = temp/10;
	   }
	   if(n%sum==0) {
	   	System.out.println("It is a HarshadNumber");
	   }
	   else{
	   	System.out.println("It is not a HarshadNumber");
	   }

	}

}