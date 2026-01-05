class JavaApplication{
public static void execution (){
    // ArithmeticOperation.addition(2,3);
     //ArithmeticOperation.addition(5,3);

   Scanner sc = new Scanner(System.in);
   System.out.println("Enter starting point");
   int s = sc.nextInt();
   System.out.println("Enter ending point ");
   int e = sc.nextInt();
   NumberDisplayerSystem.series(s,e);


    // NumberDisplayerSystem.series(1,7);
    // NumberDisplayerSystem.series(8,2);
}
}