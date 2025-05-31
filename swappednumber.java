import java.util.Scanner;
public class NewClass1 {

 public static void main(String[] args){
   
   Scanner scan = new Scanner(System.in);
   
   System.out.println("enter first number");
   int a= scan.nextInt();
   System.out.println("enter first number");
   int b= scan.nextInt();
   
   b=a+b;
   a=b-a;
   b=b-a;
   
   System.out.println("number are swapped" + a + b);
 
  
 }
}
