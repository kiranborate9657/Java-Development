
 import java.util.Scanner;
public class Areaofcircle {
    public static void main(String [] args)
    {
        System.out.println("Calculating the Area of the Circle::");
        float a;
        int b;
        float pi=3.14f;
        System.out.println("Enter the radious of the Circle:");
        Scanner sc=new Scanner(System.in);
        a = sc.nextFloat();
        float result=pi*a*a;
        System.out.println(" Area of the Circle is: "+result);
        



    }
}
