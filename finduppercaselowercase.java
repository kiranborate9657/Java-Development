
import java.util.Scanner;
public class finduppercaselowercase {
    public static void main(String[] args) {
        System.out.println("Enter the character: ");
        Scanner sc=new Scanner(System.in);
        char ch;
        ch=sc.next().trim().charAt(0);
        if(ch>='a'&&ch<='z')
        {
            System.out.println("Letter is the Lowercse");
        }
        else if(ch<='Z'&&ch>='A')
        {
            System.out.println("Letter is the Uppercase");
        }
    }
}
