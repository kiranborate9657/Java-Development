import java.util.Scanner;
public class Areaoftraingle {
    public static void main(String[] args) {
        System.out.println("Calculate the Area of the traingle");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Breadth of the Traingle:");
        float b;
        b=sc.nextFloat();
        System.out.println("Enter the height of the Traingle:");
        float h;
        h=sc.nextFloat();
        float result=b*h/2;
        System.out.println("Area of the traingle in float : "+result);
        //converting the result float into int
       
        int z;
        z=(int)result;
        System.out.println(" Area of the traingle in the int: "+z);


       




    }
}
