import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        int choice=4;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter the first Number: ");
        int a;
        a=sc.nextInt();
        System.out.println("enter the second Number: ");
        int b;
        b=sc.nextInt();
       System.out.println("=====Enter your Choice=====");
       System.out.println("1.Addition");
       System.out.println("2.Subtraction");
    System.out.println("3.multiplication");
System.out.println("4.Division");

choice=sc.nextInt();
if (choice == 1) {
    System.out.println("Result = " + (a + b));
} else if (choice == 2) {
    System.out.println("Result = " + (a - b));
} else if (choice == 3) {
    System.out.println("Result = " + (a * b));
} else if (choice == 4) {
    System.out.println("Result = " + (a / b));
}
else
{
    System.out.println("You Enter the Invalid chioce!!!!!!!!!!");
}





    }
    


}
