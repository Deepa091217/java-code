import java.util.*;
public class Main {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter The Number");
    String name = sc.nextLine();
    String original = name;
    String reverse = "";
   for(int i = name.length()-1;i>=0;i--){
       reverse = reverse+name.charAt(i);
   }
    if(original.equals(reverse))
    System.out.print(" palindrome ");
    else 
        System.out.println("not an palindrome");
    }
