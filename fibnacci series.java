import java.util.*;
public class Main {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter The Number");
    int n = sc.nextInt();
    int a = n;
    int b = n;
    System.out.print(" ======Fibnacci series======= ");
    System.out.print(a+"" + b+"");
    for(int i = 2;i<n;i++)
    {
        int c = a+b;
        System.out.print(c + " ");
        a=b;
        b=c;
    }
}
}
