import java.util.Scanner;
class SpecialNumber{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n: ");
		int n=sc.nextInt();
		int t=n;
		int sum=0;
		int product=1;
		while(t!=0){
			int digit=t%10;
			sum+=digit;
			product*=digit;
			t/=10;
		}
		if((sum+product)==n){
			System.out.println(n+" is a special number!");
		}
		else{
			System.out.println(n+" is not a special number!");
		}
	}
}