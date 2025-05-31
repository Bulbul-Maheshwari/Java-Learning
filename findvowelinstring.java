import java.util.Scanner;
public class NewClass1 {


 public static void main(String[] args){
   
   Scanner scan = new Scanner(System.in);
   System.out.println("enter string");
  
  String s= scan.nextLine();
  Boolean isvowel=false;
   for(int i=0; i<s.length(); i++){
   char c= s.charAt(i);
    if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
   
   isvowel=true;
    break;
   }
   
   }
   if(isvowel){
   
   System.out.println("string contain vowel");
   }
   else{
   System.out.println("String does not contain vowel");
     
   
   }
 
  
 }
}
