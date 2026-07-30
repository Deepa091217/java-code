import java.util.*;
public class Main {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter The Number");
    int n = sc.nextInt();
    int original = n;
    int count = 0 ;
    while (n>0)
    {
        int h = n % 10;
        count = count*10+h;
        n=n/10;
    }
    if(count == original)
    System.out.print(" palindrome ");
    else 
        System.out.println("not an palindrome");
    }
}
