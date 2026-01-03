
import java.util.Scanner;
public class atm2 {
    
      public static void main(String[] args) {
        
        System.out.println("Welcome in the ATM:::");
        int balence=5000;
        int pin=4545;
        int userpin;
           

        System.out.println("LOGIN");
        System.out.println("Enter the ATM PIN-----");
        Scanner sc = new Scanner(System.in);
        userpin=sc.nextInt();
    if(pin != userpin)
    {
        System.out.println("Invalid PIN------");
    }
    else if(userpin==pin){
        System.out.println("Login Successfully");
    

    int choice=4;
    

    System.out.println("------ATM MENU-----");
    System.out.println("Check balence");
    System.out.println("Deposit money");
    System.out.println("Withdrawe Money");
    System.out.println("Exit");
    System.out.println("Enter your Choice:");
    choice=sc.nextInt();
      
    switch(choice)
    
    
    {
        case 1:
        System.out.println("Your current Balence is:"+balence);
        break;
        case 2:
        System.out.println("Enter the Money for the deposit::");
        int deposit=0;
        deposit=sc.nextInt();
        balence=balence+deposit;
        System.out.println("Your Available balence is:"+balence);
        case 3:
        System.out.println("Enter Your Money for the Withdraw::");
        int withdraw;
        withdraw=sc.nextInt();
       
       
        if(balence<withdraw)
        {
            System.out.println("Insufficient Balence");
        }
        else{
            balence=balence-withdraw;
             System.out.println("Your Money Withdraw Successfully");   
             System.out.println("Your current Balence is:"+balence);        
        }
        break;
        
        case 4:
        System.out.println("Exit");
        break;
    }
    if(choice!=4)
    {
        System.out.println("you Enered the Invalid Choice:");
    }
    sc.close();




    
    }
}

      }

