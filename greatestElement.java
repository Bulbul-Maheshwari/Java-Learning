import java.util.Scanner;
public class NewClass1 {

  // Follow the steps below to use this file

  // 1. In the main file, create an instance of this class:
  // NewClass1 instance1 = new NewClass1();

  // 2. Call the method to get the greeting message:
  // System.out.println(instance1.sayHelloFromNewClass());

 public static void main(String[] args){
   
   Scanner scan = new Scanner(System.in);
   
   System.out.println("enter first number");
   
   int n1= scan.nextInt();
   
   System.out.println("enter second number");
   
   int n2= scan.nextInt();
   
   System.out.println("enter third number");
   
   int n3= scan.nextInt();
   
   if(n1>=n2 && n1>=n3){
     System.out.println(n1);
   }
   else if (n2>=n1 && n2>=n3)
   {
     System.out.println(n2);
   }
   else
     System.out.println(n3);
   
 }
  }

