
import java.util.Scanner;
public class tillzeroenter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

         

        int num;
        int max = Integer.MIN_VALUE;

        System.out.println("Enter integers (enter 0 to stop):");

        for (;;) {   // infinite for loop
            num = sc.nextInt();

            if (num == 0)
                break;

            if (num > max)
                max = num;
        }

        System.out.println("Largest number is: " + max);
        sc.close();
    }
}

    
    

