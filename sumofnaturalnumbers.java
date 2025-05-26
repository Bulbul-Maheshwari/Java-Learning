import java.util.Scanner;
public class NewClass2 {
  

  // Follow the steps below to use this file

  // 1. In the main file, create an instance of this class:
  // NewClass2 instance2 = new NewClass2();

  // 2. Call the method to get the greeting message:
  // System.out.println(instance2.sayHelloFromNewClass());

  public static void main(String[] args)
  
{
  
  Scanner scan= new Scanner(System.in);
  
  System.out.println("enter number");
  
  int n =scan.nextInt();
  
  int sum=0;
  for(int i=1; i<=n; i++)
  {
    sum=sum+i;
  }
  
  System.out.println(sum);
  
  System.out.println((n*(n+1))/2);
  
  
  
  
}
  
}
