import java.util.Scanner;
public class largestnumber {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first Number: ");
        a=sc.nextInt();
        System.out.println("Enter the second Number: ");
        b=sc.nextInt();
        System.out.println("Enter the Second Number: ");
        c=sc.nextInt();
        if (a >= b && a >= c) {
            System.out.println("Largest number is: " + a);
        } 
        else if (b >= a && b >= c) {
            System.out.println("Largest number is: " + b);
        } 
        else {
            System.out.println("Largest number is: " + c);
        }
        
    }
}
