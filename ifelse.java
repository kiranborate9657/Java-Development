
import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
         int a;
        System.out.println("Enter the value of the Amount");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        if(a>10000)
        {
            System.out.println(" 2000 Bonus is added in our Account::");
           int b= a+2000;
            System.out.println(b);
        }
        else if(a<10000)
        {
            System.out.println("1000 Bonus is added in our Account");
            int c=a+1000;
            System.out.println(c);
        }
    





        


    }
    
}
