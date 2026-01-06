import java.util.Scanner;
public class days {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int day;
        while(true)
        {

        System.out.println("Enter the Number OF the Day: ");
        day=sc.nextInt();
        switch(day)
        {
            case 1->System.out.println("sunday");
            case 2->System.out.println("Monday");
            case 3->System.out.println("tuesday");
            case 4->System.out.println("wednesday");
            case 5->System.out.println("Thirsday");
            case 6->System.out.println("friday");
            case 7->System.out.println("saturday");
            default->System.out.println("put the valid Number!!!!");
        }
    }
}
    
}
