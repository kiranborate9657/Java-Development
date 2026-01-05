public class reversenumprint {
    public static void main(String[] args) {
    int num=1234;
    int r=0;
    while(num>0)
    {
        int rem=num%10;
        num/=10;
        r=r*10+rem;
       // System.out.println("The reverse Number is:  "+r);
    }
     System.out.println("The reverse Number is:  "+r);





     }


}
