import java.util.*;
public class Main {
    public static void main(String[]args){
         Scanner sc = new Scanner (System.in);
         System.out.println("1.Teacher Login");
         System.out.println("2.Student Login");
         System.out.println("Choose Option:");
        System.out.print("Enter Student Name :");
        
        System.out.print("Choose option:");
        int choice=sc.nextInt();
        sc.nextLine();
    
        if (choice == 1){
            System.out.println("Teacher Username:");
            String user=sc.nextLine();
            System.out.println("Teacher Password:");
            String pass=sc.nextLine();
            if(user.equals("Teacher")&&pass.equals("1234")){
                System.out.println("Teacher Login Successfull");
            }
 // Teacher Enter the Student Mark
System.out.println("Enter Roll Number :");
 int roll = sc.nextInt(); 
 System.out.println("Enter Maths Mark :");
 int maths = sc.nextInt(); 
 System.out.println("Enter Tamil Mark :");
 int tamil = sc.nextInt(); 
 System.out.println("Enter English Mark :");
 int english = sc.nextInt(); 
 System.out.println("Enter Science Mark :");
 int science = sc.nextInt(); 
 System.out.println("Enter biology Mark :");
 int biology = sc.nextInt(); 
 System.out.println("Enter Chemistry Mark :");
 int chemistry = sc.nextInt(); 
 System.out.println("Enter Total Mark  :");
 int total = sc.nextInt(); 
 System.out.println("Student Mark Saved :");
 int mark = sc.nextInt(); 
    }
   
        
    else if (choice == 2){
        System.out.println("Student Username:");
            String user=sc.nextLine();
            System.out.println("Student Password:");
            String pass=sc.nextLine();
            if(user.equals("Student")&&pass.equals("1111"))
            {
                System.out.println("Student Login Successfull");
                System.out.println("Your Mark : +");
            }
    }
            else if (choice==3){
        System.out.println("Invalid StudentUsername or Password");
            }
            else {
                System.out.println("Invalid Choice");
            }
    }
}

