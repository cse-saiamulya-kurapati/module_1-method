class RamanujanNumber{
	public static void ram(int n){
          int temp = n;
          int sum = 0;
          while(temp>0) {
          	 sum += temp % 10;
          	temp = temp/10;
                
          } int s = sum;
          int rev = 0;
          while(s>0) {
          	rev = (rev*10) + (s%10);
          	s = s/10;
          }

           int d = rev*sum;
           if(d==n) {
           	System.out.println("ramanujan number");
           } else {
           	System.out.println("No");
           }


	}
}