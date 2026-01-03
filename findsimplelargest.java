
import java.util.Scanner;
public class findsimplelargest {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number: ");
        a=sc.nextInt();
         System.out.println("Enter the second Number: ");
        b=sc.nextInt();
         System.out.println("Enter the third Number: ");
        c=sc.nextInt();
         int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        System.out.println("Largest number is: " + max);

        sc.close();
        


    }
}
