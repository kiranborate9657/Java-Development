import java.util.Scanner;
public class switchh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String fruit;
        System.out.println("Enter the Friut Name: ");
        fruit=sc.next();
        switch(fruit)
        {
            case "mango":
            System.out.println("King of the fruit");
            break;
            case "apple":
            System.out.println("Small sweet fruit");
            break;
            case "orange":
            System.out.println("Filled with the Vitamin C");
            break;
            default:
            System.out.println("putting the Invalid input");
        }
    }
    
}
