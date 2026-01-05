import java.util.Scanner;
class Calculator{
	public static void main(String[]args){
		System.out.println("Welcome to Calculator App!\n");
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		do{
			System.out.println("\nSelect your choice\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");
			int n=sc.nextInt();
			switch(n){
				case 1:{
					System.out.print("Enter a: ");
					int a=sc.nextInt();
					System.out.print("Enter b: ");
					int b=sc.nextInt();
					int r=Math.addExact(a,b);
					System.out.println("Addition of "+a+" and "+b+" is: "+Math.addExact(a,b));
					break;
				}
				case 2:{
					System.out.print("Enter a: ");
					int a=sc.nextInt();
					System.out.print("Enter b: ");
					int b=sc.nextInt();
					int r=Math.subtractExact(a,b);
					System.out.println("Subtraction of "+a+" and "+b+" is: "+r);
					break;
				}
				case 3:{
					System.out.print("Enter a: ");
					int a=sc.nextInt();
					System.out.print("Enter b: ");
					int b=sc.nextInt();
					int r=Math.multiplyExact(a,b);
					System.out.println("Multiplication of "+a+" and "+b+" is: "+r);
					break;
				}
				case 4:{
					System.out.print("Enter a: ");
					int a=sc.nextInt();
					System.out.print("Enter b: ");
					int b=sc.nextInt();
					int r=Math.divideExact(a,b);
					System.out.println("Division of "+a+" and "+b+" is: "+r);
					break;
				}
				case 5:{
					System.out.print("Thanks!");
					flag=false;
					break;
				}
				default:{
					System.out.println("Invalid Choice!");
				}
			}
		}while(flag);
		
		
	}
}