import java.util.Scanner;
public class NewClass1 {

  // Follow the steps below to use this file

  // 1. In the main file, create an instance of this class:
  // NewClass1 instance1 = new NewClass1();

  // 2. Call the method to get the greeting message:
  // System.out.println(instance1.sayHelloFromNewClass());

  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enetr string");
     String s= scan.nextLine().toLowerCase();
     
     for(int i=0; i<s.length(); i++)
     
     {
       
       char c= s.charAt(i);
       
      if (c!='a' && c!='e' && c!='i' && c!='o' && c!='u')
      
        System.out.println(c);
        
      
      
     
      
     }
      scan.close();
     
  }

}
