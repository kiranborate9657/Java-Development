
import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        System.out.println("Enter the number::");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int count=0;
        for(int i=1;i<=x;i++)
        {
           if(x%i==0)
           {
              count++;
           }
        }


         if(count==2)
        {
            System.out.println(x +"This is the Prime Number");
        }
        else{
            System.out.println(x +"THis is not prime number");

        }
        sc.close();

    }
    
}
