import java.util.Scanner;
public class NewClass1 {

  // Follow the steps below to use this file

  // 1. In the main file, create an instance of this class:
  // NewClass1 instance1 = new NewClass1();

  // 2. Call the method to get the greeting message:
  // System.out.println(instance1.sayHelloFromNewClass());

 public static void main(String[] args){
   
 Scanner scan= new Scanner(System.in);
 
 System.out.println("enter string");
 String s= scan.nextLine();
 String revers="";
 
 for(int i=s.length()-1; i>=0; i--)
 {
   revers+= s.charAt(i);
  }
  if(s.equalsIgnoreCase(revers)){
    System.out.println("String is palindrome");}
  else{
    System.out.println("String is not palindrome");
  }
  
  scan.close();
  }
  
 }

