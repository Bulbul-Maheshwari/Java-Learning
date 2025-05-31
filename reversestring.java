import java.util.Scanner;
public class NewClass1 {



 public static void main(String[] args){
   
 Scanner scan= new Scanner(System.in);
 
 System.out.println("enter string");
 String s= scan.nextLine();
 String revers="";
 
 for(int i=s.length()-1; i>=0; i--)
 {
   revers+= s.charAt(i);
  }
  System.out.println("reverse string is "+ revers);
  
  scan.close();
  }
  
 }

