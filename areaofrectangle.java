import java.util.Scanner;

public class areaofrectangle {
    public static void main(String[] args) {
        System.out.println("Enter the length of the rectangle: ");
        int l;
        Scanner sc=new Scanner(System.in);
        l=sc.nextInt();
        System.out.println("Enter the Breadth of the rectangle: ");
        int b;
        b=sc.nextInt();
        int result;
        result=l*b;
        System.out.println("Area of the rectangle is: "+ result);
    }
    
}
