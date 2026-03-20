public class WrapperExample {
    public static void main(String[] args) {
        
        // String to int
        int a = Integer.parseInt("100");
        
        // int to Integer object
        Integer obj = Integer.valueOf(a);
        
        // Integer to int
        int b = obj.intValue();
        
        // Integer to String
        String str = obj.toString();
        
        System.out.println("a = " + a);
        System.out.println("Object = " + obj);
        System.out.println("b = " + b);
        System.out.println("String = " + str);
    }
}
