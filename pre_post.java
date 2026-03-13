public class pre_postincrment {
    public static void main(String[] args) {
        int a=50;
        int c=++a; // pre-increment
        System.out.println("Value of a: " + c); // 51

        int b=20;
        System.out.println("Value of b: " + b++); // 20
        System.out.println("Value of b after post-increment: " + b); // 21

        
    }
}
