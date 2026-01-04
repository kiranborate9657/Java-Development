import java.util.Scanner;
public class isoscelestriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h,b;
        System.out.println("Eneter the Base of the isosceles traingle: ");
        b=sc.nextInt();
        System.out.println("Eneter the height of the isosceles traingle: ");
        h=sc.nextInt();
        int result;
        result=b*h/2;
        System.out.println("Area of the isosceles Traingle is: "+result);
    }
    
}
